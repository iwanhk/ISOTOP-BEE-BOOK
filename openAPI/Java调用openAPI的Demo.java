

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.Charsets;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * create by wjk on 2022/8/21
 */
public class OpenApiUtils {

    public static void main(String[] args) {
        Map<String, String> paramsReadCall = new HashMap<>();
        paramsReadCall.put("chainid", "12231");
        // paramsReadCall.put("tokenId", "1");
        // paramsReadCall.put("contract", "cfxtest:acc4kwp75hu9cetcdvu0dsb0zxnmr54cwpw0z77axp");
        paramsReadCall.put("contract", "0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002");

        //paramsReadCall.put("data", "0x0e89341c0000000000000000000000000000000000000000000000000000000000000000");
        //claim
        //paramsReadCall.put("data", "0x4e71d92d");
        //totalSupply()
        //paramsReadCall.put("data", "0x18160ddd");
        //owner
        // paramsReadCall.put("data", "0x8da5cb5b");
        //ownerOf 48
        //paramsReadCall.put("data", "0x6352211e0000000000000000000000000000000000000000000000000000000000000002");
        paramsReadCall.put("data", "0xceb35b0f000000000000000000000000000000000000000000000000000000000000004000000000000000000000000044028da500c013dd54e1e0beedc839317799b174000000000000000000000000000000000000000000000000000000000000000b313233313233312e646964000000000000000000000000000000000000000000");
       
        paramsReadCall.put("id", "");
        paramsReadCall.put("fromAddress", "");
        // paramsReadCall.put("gas_limit", "625000");
        Map<String, String> headerMap = makeHeaders(paramsReadCall);
        System.out.println("header参数》》" + headerMap);
        System.out.println("body参数》》" + paramsReadCall);

        // String rs2 = getRequest("https://www.isotop.top/chain-api/api/v1/chain/create", headerMap, params);
        // System.out.println(rs2);

        //  String rsc3 = getRequest("https://www.isotop.top/chain-api/api/v1/chain/getTransactionByHash", headerMap, params);
        // System.out.println(rsc3);
//
//         String rs = getRequest("https://www.isotop.top/chain-api/api/v1/chain/queryAsset", headerMap, paramsReadCall);
//         System.out.println(rs);
//         String rs = getRequest("https://www.isotop.top/chain-api/api/v1/chain/readCall", headerMap, paramsReadCall);
//         System.out.println(rs);
//         String rs = getRequest("https://www.isotop.top/chain-api/api/v1/chain/queryUser", headerMap, paramsReadCall);
//         System.out.println(rs);

        String rs3 = postRequest("https://www.isotop.top/chain-api/api/v1/chain/writeCall", headerMap, paramsReadCall);
        System.out.println(rs3);

    }

    public static Map<String, String> makeHeaders(Map<String, String> data) {
        Map<String, String> rsMap = new HashMap<>();
        String nonce = System.currentTimeMillis() / 1000 + "" + (int) ((Math.random() * 9 + 1) * 100000);
        String timestamp = System.currentTimeMillis() / 1000 + "";

        //替换自己的apikey
        rsMap.put("apiKey", "7956ca03fe44238ef1d254799de1b556");
        rsMap.put("timestamp", timestamp);
        rsMap.put("nonce", nonce);
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(rsMap);
        sortedMap.putAll(data);
        StringBuilder sbd = new StringBuilder();
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            // 排除空val的参数
            if (StringUtils.isEmpty(entry.getValue())) {
                continue;
            }
            sbd.append(entry.getKey()).append(entry.getValue());
        }
        // System.out.println("ASCII排序字符串" + sbd.toString());
        //替换自己的apiSecret
        String apiSecret = "bd09139024cdd3136a4f6cf60038c1194e6641063e413c47f517a579fbb158ba";
        sbd.append(apiSecret);
        rsMap.put("sign", DigestUtils.md5Hex(sbd.toString()));
        return rsMap;
    }

    private static String sign(String nonce, Map<String, String> data) {
        List paramArr = new ArrayList<>();
        for (String key : data.keySet()) {
            paramArr.add(key + "=" + data.get(key));
        }
        Collections.sort(paramArr);
        System.out.println(paramArr);
        String paramStr = String.join("", paramArr);

        String signature = DigestUtils.md5Hex(paramStr);
        return signature;
    }

    public static String postRequest(String url, Map<String, String> headerMap, Map<String, String> paramsMap) {
        System.out.println("header参数》》" + headerMap);
        System.out.println("body参数》》" + paramsMap);
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        List<NameValuePair> content = new ArrayList<NameValuePair>();
        Iterator iterator = paramsMap.entrySet().iterator();           //将content生成entity
        while (iterator.hasNext()) {
            Map.Entry<String, String> elem = (Map.Entry<String, String>) iterator.next();
            content.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
        }
        CloseableHttpResponse response = null;
        try {
            Iterator headerIterator = headerMap.entrySet().iterator();          //循环增加header
            while (headerIterator.hasNext()) {
                Map.Entry<String, String> elem = (Map.Entry<String, String>) headerIterator.next();
                post.addHeader(elem.getKey(), elem.getValue());
            }
            if (content.size() > 0) {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(content, "UTF-8");
                post.setEntity(entity);
            }
            response = httpClient.execute(post);            //发送请求并接收返回数据
            if (response != null && response.getStatusLine().getStatusCode() == 200) {
                HttpEntity entity = response.getEntity();       //获取response的body部分
                result = EntityUtils.toString(entity);          //读取reponse的body部分并转化成字符串
            }
            return result;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public static String getRequest(String url, Map<String, String> headerMap, Map<String, String> paramMap) {
        System.out.println("header参数》》" + headerMap);
        System.out.println("body参数》》" + paramMap);
        String result = "";
        BufferedReader in = null;
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "UTF-8");

        String reqUrl = url + "?" + param;
        System.out.println("******************" + reqUrl);
        try {
            RequestConfig config = RequestConfig.custom().setConnectTimeout(3000)
                    .setConnectionRequestTimeout(3000).build();
            HttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
            HttpGet htGet = new HttpGet(reqUrl);
            // 添加http headers
            if (headerMap != null && headerMap.size() > 0) {
                for (String key : headerMap.keySet()) {
                    htGet.addHeader(key, headerMap.get(key));
                }
            }
            HttpResponse r = client.execute(htGet);
            in = new BufferedReader(new InputStreamReader(r.getEntity().getContent(), Charsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    private static List<NameValuePair> setHttpParams(Map<String, String> paramMap) {
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        Set<Map.Entry<String, String>> set = paramMap.entrySet();
        for (Map.Entry<String, String> entry : set) {
            formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return formparams;
    }

    /**
     * base64解码
     *
     * @param record
     * @return
     */
    public static String base64(String record) {
        if (record.contains("base64")) {
            /**
             * base64的方式
             */
            //以逗号分割取出
            String[] split = record.split(",");
            String s = split[1];
            //base64解码
            byte[] decodeBytes = Base64.getDecoder().decode(split[1]);
            String s1 = new String(decodeBytes);
            return s1;
        } else {
            return null;
        }

    }

}
