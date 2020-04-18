package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@Mapper
public interface PaymentDao {
    /**
     * 新增Payment
     * @param payment
     * @return int
     */
    public int create(Payment payment);

    /**
     * 根据Id获取Payment
     * @param id
     * @return  Payment
     */
    public Payment getPaymentById(@Param("id") Long id);
}
