package com.qfedu.common.message.core.entity;

import lombok.Data;

import java.util.Date;

@Data
public class MsgReceive {
    private Long id;
    private String no;  //手机号或邮箱号
    private Date createtime; //操作时间 1、短信验证码 2、短信消息推送 3、短信账户变更 4、邮箱激活码 5、邮箱推送消息 6、邮箱变更信息
    private Integer flag;   //标记位   1、短信 2、邮箱
}
