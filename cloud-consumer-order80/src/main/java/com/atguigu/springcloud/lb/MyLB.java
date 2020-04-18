package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhaoyuancong
 * @date 2020/4/1 10:27
 */
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 获取第几次访问，次数
     * @return int 访问次数
     */
    public final int getAndIncrement(){
        int current;
        int next;

        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while(!atomicInteger.compareAndSet(current,next));
        System.out.println("***********第几次访问，次数next: " + next);
        return next;
    }

    /**
     * 手写负载均衡，轮询算法
     * @param serviceInstances
     * @return 某个服务下标
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        //请求次数 % 指定名称的服务总数 = 轮询
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
