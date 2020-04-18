package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类：Ribbon自定义负载算法
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@Configuration
public class MySelfRule {

    /**
     * IRule是Ribbon提供的负载均衡的接口，有7种实现包括轮询、随机等
     * @return RandomRule
     */
    @Bean
    public IRule iRule(){
        //负载均衡，定义为随机
        return new RandomRule();
    }
}
