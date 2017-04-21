/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;

/**
 * @author yangle
 * @version $Id SwaggerConfig.java, v 0.1 2017-02-05 下午3:17 yangle Exp $$
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("eureka.client.serviceUrl.defaultZone")
    private String url;

    @Autowired
    private Environment env;

    @PostConstruct
    public void getU() {
        System.out.println(env.getProperty("eureka.client.serviceUrl.defaultZone"));
    }

    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zs5s.controller"))
                .paths(PathSelectors.any())//过滤的接口
                .build().apiInfo(demoApiInfo());
    }

    private ApiInfo demoApiInfo() {
        ApiInfo apiInfo = new ApiInfo("豆神科技",//大标题
                "豆神科技",//小标题
                "1.0",//版本
                "NO terms of service",
                "Angle",//作者
                "The Apache License, Version 2.0",//链接显示文字
                "http://www.apache.org/licenses/LICENSE-2.0.html"//网站链接
        );

        return apiInfo;
    }
}