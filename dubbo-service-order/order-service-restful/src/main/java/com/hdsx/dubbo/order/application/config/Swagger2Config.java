package com.hdsx.dubbo.order.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hdsx.dubbo.order.application.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .description("Dubbo-微服务脚手架项目-ORDER , 项目开始时间：2020年02月24日20:40:44，作者：梁铖城")
                .title("分布式微服务")
                .version("1.1.1")
                .build();
    }
}