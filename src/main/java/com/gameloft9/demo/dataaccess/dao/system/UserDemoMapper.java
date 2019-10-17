package com.gameloft9.demo.dataaccess.dao.system;

import com.gameloft9.demo.dataaccess.model.system.UserDemo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author: 帅气的达
 * @date:   创建时间：2019/10/17 15:29
 * @Email:  867256260@qq.com
 * @description:
 */
public interface UserDemoMapper {

    List<UserDemo> listUserDemo(@Param("start") int start,
                                @Param("end") int end,
                                @Param("username") String username);

    int countUserdemo(@Param("username") String username);

    int adduserdemo(UserDemo userDemo);

    UserDemo findById(@Param("id") int id);

    int updateuser(UserDemo userDemo);

    int deleteUserDemo(@Param("id") int id);
}
