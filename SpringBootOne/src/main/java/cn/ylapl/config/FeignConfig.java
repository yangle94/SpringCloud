package cn.ylapl.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Angle
 * Date: 2017/7/9
 * Time: 上午8:39
 */
@Configuration
public class FeignConfig {

    /**
     * feign日志级别(全局)
     * @return feign日志级别对象
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
}