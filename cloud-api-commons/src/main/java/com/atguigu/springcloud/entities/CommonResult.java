package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回类：
 *      @Data 包含getter、setter、toString、equals、hash、等
 *      @AllArgsConstructor 全参构造
 *      @NoArgsConstructor  无参构造
 * @author zhaoyuancong
 * @date 2020/3/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
