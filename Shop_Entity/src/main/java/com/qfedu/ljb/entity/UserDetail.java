package com.qfedu.ljb.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户详情类
 */

@Data
public class UserDetail {
    private Integer id;
    private  Integer uid;
    private String nickname;    //昵称  只能是中文和字母
    private Short sex;
    private Date birthday;      //生日    1、有效  2、无效
    private String headurl;     //头像路径
    private Date createtime;    //创建时间

}
