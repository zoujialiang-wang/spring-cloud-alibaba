package com.zjl.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zoujialiang
 * @date 2020/11/26 21:37
 */
@Configuration
public class OpenFeignLogConfig {
    @Bean
    Logger.Level feignLoggerLeave(){
        return Logger.Level.FULL;
    }
}
