package com.qfedu.ljb.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户日志类
 */


@Data
public class UserLog {
    private Long id;
    private Integer uid;
    private Integer flag;   //标记位   1、注册 2、登录
    private Date createtime;    //时间
    private String content;     //内容


}
