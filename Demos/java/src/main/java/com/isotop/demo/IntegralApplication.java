package com.isotop.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.isotop.demo.mapper")
@MapperScan("com.baomidou.mybatisplus.core.mapper")
//@ServletComponentScan
//@ComponentScan(value = "org.springframework.mobile.device")
@EnableScheduling
@EnableCaching
public class IntegralApplication {
    private final static Logger logger = LoggerFactory.getLogger(IntegralApplication.class);

    public static void main(String[] args) {
        // 打印项目信息
        ConfigurableApplicationContext context = SpringApplication.run(IntegralApplication.class, args);
        logger.info("项目启动成功");
    }
}
