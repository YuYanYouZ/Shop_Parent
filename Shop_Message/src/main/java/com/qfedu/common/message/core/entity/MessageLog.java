package com.qfedu.common.message.core.entity;

import lombok.Data;

import java.util.Date;

/**
 * 消息流水类
 */
@Data
public class MessageLog {
    private Long id;
    private Long mid;   //项目编号
    private Date createtime;    //操作时间 1、短信验证码 2、短信消息推送 3、短信账户变更 4邮箱激活码 5、邮箱推送信息 6、邮箱变更信息
    private String ip;  //操作IP
    private String info;    //备注信息

}
