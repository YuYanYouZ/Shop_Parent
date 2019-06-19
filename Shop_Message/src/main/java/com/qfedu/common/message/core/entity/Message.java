package com.qfedu.common.message.core.entity;

import lombok.Data;

@Data
public class Message {
    private Long id;
    private Integer pcode;  //项目编号
    private Integer type;   //类型   1、短信验证码 2、短信消息推送 3、短信账户变更  4、邮箱激活码 5、邮箱推送信息 6、邮箱变更信息
    private String title;   //标题
    private String content;     //内容
    private String receive;     //接收人  手机号 邮箱
    private Integer flag;   //标记位   1、发送成功 2、发送失败 3、异常

}
