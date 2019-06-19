package com.qfedu.ljb.entity;

import lombok.Data;

/**
 * 用户
 */
@Data
public class User {
    private Integer id;
    private String phone;
    private String password;
    private Integer flag;      //标记位    1、有效    2、无效


}
