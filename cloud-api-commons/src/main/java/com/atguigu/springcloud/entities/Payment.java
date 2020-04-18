package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 实体类：
 *      @Data   //包含getter、setter、toString、equals、hash、等
 *      @AllArgsConstructor //全参构造
 *      @NoArgsConstructor  //无参构造
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
