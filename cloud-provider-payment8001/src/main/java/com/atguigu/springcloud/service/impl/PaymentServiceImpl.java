package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    /**
     * 新增Payment
     * @param payment
     * @return int
     */
    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    /**
     * 根据id获取Payment
     * @param id
     * @return Payment
     */
    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
