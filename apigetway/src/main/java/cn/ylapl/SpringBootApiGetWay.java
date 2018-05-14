/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoRestTemplateCustomizer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.security.oauth2.client.token.AccessTokenProviderChain;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.implicit.ImplicitAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordAccessTokenProvider;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author yangle
 * @version $Id SeleniumMontitoring.java, v 0.1 2017-01-21 下午5:18 yangle Exp $$
 */
@EnableOAuth2Sso
@EnableResourceServer
@EnableZuulProxy
@SpringCloudApplication
public class SpringBootApiGetWay {

    @Bean
    UserInfoRestTemplateCustomizer userInfoRestTemplateCustomizer(LoadBalancerInterceptor loadBalancerInterceptor) {

        return template -> {
            List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
            interceptors.add(loadBalancerInterceptor);
            AccessTokenProviderChain accessTokenProviderChain = Stream
                    .of(new AuthorizationCodeAccessTokenProvider(), new ImplicitAccessTokenProvider(),
                            new ResourceOwnerPasswordAccessTokenProvider(), new ClientCredentialsAccessTokenProvider())
                    .peek(tp -> tp.setInterceptors(interceptors))
                    .collect(Collectors.collectingAndThen(Collectors.toList(), AccessTokenProviderChain::new));
            template.setAccessTokenProvider(accessTokenProviderChain);
        };
    }

    public static void main(String arg[]) {

        SpringApplication.run(SpringBootApiGetWay.class, arg);
    }


}
