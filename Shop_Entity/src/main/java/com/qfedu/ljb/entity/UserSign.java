package com.qfedu.ljb.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;

/**
 * 用户签到
 *
 */
@Data
public class UserSign {
    private BigInteger id;
    private int uid;
    private int score;  //获取积分
    private int extrascore;     //额外积分
    private int days;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;    //时间




}
