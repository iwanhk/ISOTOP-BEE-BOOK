package com.isotop.demo.filter;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */

//@WebFilter(filterName = "test", urlPatterns = "/integral/*")
public class JwtTokenFilter implements Filter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JwtHelper jwtHelper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----------------------->过滤器被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse rep = (HttpServletResponse) servletResponse;

        String uri = httpRequest.getRequestURI();//返回请求行中的资源名称
        String url = httpRequest.getRequestURL().toString();//获得客户端发送请求的完整url
        String ip = httpRequest.getRemoteAddr();//返回发出请求的IP地址
        String ipAddress = getIpAddress(httpRequest);
        String params = httpRequest.getQueryString();//返回请求行中的参数部分
        String host = httpRequest.getRemoteHost();//返回发出请求的客户机的主机名
        int port = httpRequest.getRemotePort();//返回发出请求的客户机的端口号。
        // String authToken = httpRequest.getHeader("Authorization");

        //设置允许跨域的配置
        // 这里填写你允许进行跨域的主机ip（正式上线时可以动态配置具体允许的域名和IP）
        rep.setHeader("Access-Control-Allow-Origin", "*");
        // 允许的访问方法
        rep.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
        // Access-Control-Max-Age 用于 CORS 相关配置的缓存
        rep.setHeader("Access-Control-Max-Age", "3600");
        rep.setHeader("Access-Control-Allow-Headers", "token,isWeb,Origin, X-Requested-With, Content-Type, Accept");

        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("application/json; charset=utf-8");

        String authToken = httpRequest.getHeader("token");
        System.out.println("authToken");
        System.out.println(authToken);
        String isWeb = httpRequest.getHeader("isWeb");

        //以后正式需要注释掉
        String requestURI = httpRequest.getRequestURI();
        System.out.println("--------------------->过滤器：请求地址" + requestURI);


        //从cookie 中获取jwt token
        String username = jwtHelper.getUsernameFromToken(authToken);
        if ("/miniapi/integral/login".equals(requestURI) || "//miniapi/integral/login".equals(requestURI) ||
                "/miniapi/integral/wxlogin".equals(requestURI) || "//miniapi/integral/wxlogin".equals(requestURI) ||
                "/miniapi/integral/notify".equals(requestURI) || "//miniapi/integral/notify".equals(requestURI)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        logger.info("checking authentication für user " + username);

        if (username != null) {
            String account = "";
//            CompanyUserAccountVO companyUserAccountVO = companyUserAccountService.selectCompanyToken();
//            logger.info("companyUserAccountVO:" + companyUserAccountVO.toString());
//            account = companyUserAccountVO.getAccount();
//            Boolean aBoolean = jwtHelper.validateToken(authToken, account);
//            logger.info("验证 token 有效性.authToken:" + authToken + "=====account:" + "=====" + aBoolean);
//            // 验证 token 有效性.
//            if (aBoolean) {
//                filterChain.doFilter(servletRequest, servletResponse);
//                return;
//            }

            // 验证token 失败.
            resultWrite((HttpServletResponse) servletResponse);
            try {
                //   interfaceHistoryService.saveDO(interfaceHistory);
            } catch (Exception e) {
                e.printStackTrace();
                logger.info("保存接口记录失败了，失败了");
            }
            return;
        } else {
            // 验证token 失败.
            resultWrite((HttpServletResponse) servletResponse);
            return;
        }

    }

    private void resultWrite(HttpServletResponse servletResponse) throws IOException {
        HttpServletResponse httpResponse = servletResponse;
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setContentType("application/json; charset=utf-8");
        httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        ObjectMapper mapper = new ObjectMapper();
        JSONObject resultMsg = new JSONObject();
        resultMsg.put("result_code", 40002);
        resultMsg.put("msg", "不合法的凭证类型!");
        httpResponse.getWriter().write(mapper.writeValueAsString(resultMsg));
    }

    @Override
    public void destroy() {
        System.out.println("----------------------->过滤器被销毁");

    }

    /**
     * 获取用户真实IP地址，不使用request.getRemoteAddr();的原因是有可能用户使用了代理软件方式避免真实IP地址,
     * <p>
     * 可是，如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值，究竟哪个才是真正的用户端的真实IP呢？
     * 答案是取X-Forwarded-For中第一个非unknown的有效IP字符串。
     * <p>
     * 如：X-Forwarded-For：192.168.1.110, 192.168.1.120, 192.168.1.130,
     * 192.168.1.100
     * <p>
     * 用户真实IP为： 192.168.1.110
     *
     * @param request
     * @return
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
