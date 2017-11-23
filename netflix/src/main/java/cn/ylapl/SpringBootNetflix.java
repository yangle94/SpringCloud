/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yangle
 * @version $Id SeleniumMontitoring.java, v 0.1 2017-01-21 下午5:18 yangle Exp $$
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringBootNetflix {

    public static void main(String arg[]) {

        new SpringApplicationBuilder(SpringBootNetflix.class).web(true).run(arg);
    }

}
