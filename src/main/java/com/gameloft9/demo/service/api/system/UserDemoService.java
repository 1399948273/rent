package com.gameloft9.demo.service.api.system;

import com.gameloft9.demo.dataaccess.model.system.UserDemo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @author: 帅气的达
 * @date:   创建时间：2019/10/17 15:43
 * @Email:  867256260@qq.com
 * @description:
 */
public interface UserDemoService {

    List<UserDemo> listUserDemo(String page, String limit, String username);

    int countUserdemo(String username);

    int adduserdemo(UserDemo userDemo);

    UserDemo findById(int id);

    int updateuser(UserDemo userDemo);

    int deleteUserDemo(int id);
}
