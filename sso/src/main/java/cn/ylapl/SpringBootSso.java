/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author yangle
 * @version $Id SeleniumMontitoring.java, v 0.1 2017-01-21 下午5:18 yangle Exp $$
 */
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringBootSso {

    //必须要,resource-server会用到
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    public static void main(String arg[]) {

        SpringApplication.run(SpringBootSso.class, arg);
    }
}
