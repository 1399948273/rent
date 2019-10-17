package com.gameloft9.demo.service.impl.system;

import com.gameloft9.demo.dataaccess.dao.system.UserDemoMapper;
import com.gameloft9.demo.dataaccess.model.system.UserDemo;
import com.gameloft9.demo.service.api.system.UserDemoService;
import com.gameloft9.demo.service.beans.system.PageRange;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author: 帅气的达
 * @date:   创建时间：2019/10/17 15:44
 * @Email:  867256260@qq.com
 * @description:
 */
@Slf4j
@Service
public class UserDemoServiceImpl implements UserDemoService {

    @Autowired
    UserDemoMapper userDemoMapper;

    public List<UserDemo> listUserDemo(String page, String limit, String username) {
        PageRange pageRange = new PageRange(page, limit);
        return userDemoMapper.listUserDemo(pageRange.getStart(), pageRange.getEnd(), username);
    }

    public int countUserdemo(String username) {
        return userDemoMapper.countUserdemo(username);
    }

    public int adduserdemo(UserDemo userDemo) {
        return userDemoMapper.adduserdemo(userDemo);
    }

    public UserDemo findById(int id) {
        return userDemoMapper.findById(id);
    }

    public int updateuser(UserDemo userDemo) {
        return userDemoMapper.updateuser(userDemo);
    }

    public int deleteUserDemo(int id) {
        return userDemoMapper.deleteUserDemo(id);
    }
}
