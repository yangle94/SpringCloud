package cn.ylapl; /**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yangle
 * @version $Id SeleniumMontitoring.java, v 0.1 2017-01-21 下午5:18 yangle Exp $$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootTwo {

    public static void main(String arg[]) {

        SpringApplication.run(SpringBootTwo.class, arg);
    }

}