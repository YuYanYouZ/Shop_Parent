package com.qfedu.ljb.server.user.dao;

import com.qfedu.ljb.entity.UserSign;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSignDao {
    //新增
    int insert(UserSign sign);

    List<UserSign> selectByUid(int uid);

    UserSign selectByUidLast(int uid);
    //近5天的签到数据  近30天的签到数据
    List<UserSign> selectByUidDays(@Param("uid") int uid, @Param("days") int days);


}
