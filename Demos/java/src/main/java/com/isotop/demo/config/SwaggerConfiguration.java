package com.isotop.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * create by wjk on 2020/11/3
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Value("${swagger.show}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 构建api文档的详细方法
     *
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("同位素Api")
                //创建
                .termsOfServiceUrl("http://www.isotop.top")
                .version("1.0.0")
                //描述
                .description("API 描述")
                .build();
    }

    @Bean
    public Docket createRestApiForAdmin() {
        return new Docket(DocumentationType.SWAGGER_2).enable(swaggerShow).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.dandelion.demo.controller"))
                .paths(PathSelectors.any()).build().groupName("后端系统api").pathMapping("/");
    }
}
