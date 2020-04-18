package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * PaymentMain8004主启动类
 *      @EnableDiscoveryClient  //该注解用于向使用consul或zookeeper作为注册中心时注册服务
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
