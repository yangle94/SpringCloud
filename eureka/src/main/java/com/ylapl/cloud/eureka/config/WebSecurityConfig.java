//package com.ylapl.cloud.eureka.config;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * 加入spring-boot-starter-security包时，使eureka不进入保护范围
// * date: 2019/8/30
// * time: 9:33 上午
// * author: Angle
// */
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().ignoringAntMatchers("/eureka/**");
//		//eureka接口允许不需要验证
////		http.authorizeRequests().mvcMatchers("/eureka/**").permitAll();
//		super.configure(http);
//	}
//}