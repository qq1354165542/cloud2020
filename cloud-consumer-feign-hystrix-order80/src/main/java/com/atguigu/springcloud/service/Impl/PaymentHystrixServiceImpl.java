package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyuancong
 * @date 2020/4/3 15:49
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallbackServcie fall-paymentInfo_OK ,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------PaymentFallbackServcie fall-paymentInfo_TimeOut ,/(ㄒoㄒ)/~~";
    }
}
