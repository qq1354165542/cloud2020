package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaoyuancong
 * @date 2020/3/28
 */
public interface PaymentService {
    /**
     * 新增Payment
     * @param payment
     * @return int
     */
    public int create(Payment payment);

    /**
     * 根据id获取Payment
     * @param id
     * @return Payment
     */
    public Payment getPaymentById(@Param("id") Long id);
}
