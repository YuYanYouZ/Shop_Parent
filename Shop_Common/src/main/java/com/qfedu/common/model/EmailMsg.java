package com.qfedu.common.model;

import lombok.Data;

@Data
public class EmailMsg {
    private String company; //公司名称
    private String title; //邮箱标题
    private String content; //邮箱内容
    private String email; //接收人


}
