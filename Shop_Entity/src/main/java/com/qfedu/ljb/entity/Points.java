package com.qfedu.ljb.entity;

import lombok.Data;

import java.util.Date;

/**
 * 积分变动类
 */
@Data
public class Points {
    private Long id;
    private Integer uid;
    private Integer score;  //总积分
    private String info;  //积分变动的原因
    private Date startdate;   //生效日期
    private Date enddate;   //失效日期
    private Short flag;     //标记位    1、有效   2、提醒


}
