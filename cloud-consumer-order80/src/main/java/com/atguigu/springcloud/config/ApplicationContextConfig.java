package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类：注入RestTemplate
 * @author zhaoyuancong
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * //@LoadBalanced注解赋予RestTemplate负载均衡的能力
     * @return RestTemplate 用于操作服务间的通信
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
