package com.qfedu.ljb.entity;

import lombok.Data;

/**
 * 购物车类
 */
@Data
public class Cart {
    private Integer id;
    private Integer uid;
    /** 标记位   1、注册 2、登录  */
    private Integer maxcount;
    /** 商品数量  */
    private Integer currcount;

}
