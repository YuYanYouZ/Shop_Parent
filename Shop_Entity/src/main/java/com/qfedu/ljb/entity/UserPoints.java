package com.qfedu.ljb.entity;

import lombok.Data;

/**
 * 用户积分类
 */

@Data
public class UserPoints {
    private Integer id;
    private Integer uid;
    /** 总积分  */
    private Integer totalscore;
    /** 可用积分  */
    private Integer currscore;



}
