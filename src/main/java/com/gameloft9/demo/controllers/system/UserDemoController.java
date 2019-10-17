package com.gameloft9.demo.controllers.system;

import com.gameloft9.demo.dataaccess.model.system.UserDemo;
import com.gameloft9.demo.mgrframework.beans.response.IResult;
import com.gameloft9.demo.mgrframework.beans.response.PageResultBean;
import com.gameloft9.demo.mgrframework.beans.response.ResultBean;
import com.gameloft9.demo.service.api.system.UserDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/*
 * @author: 帅气的达
 * @date:   创建时间：2019/10/17 15:25
 * @Email:  867256260@qq.com
 * @description:
 */
@Slf4j
@Controller
@RequestMapping("/userdemo")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

    @RequestMapping(value = "/listuser.do", method = RequestMethod.POST)
    @ResponseBody
    public IResult listUser (String page, String limit, String username) {
        PageResultBean<Collection<UserDemo>> resultBean =
                new PageResultBean<Collection<UserDemo>>(userDemoService.listUserDemo(page, limit, username),
                                                         userDemoService.countUserdemo(username));
        return resultBean;
    }

    @RequestMapping(value = "/addUserDemo.do", method = RequestMethod.POST)
    @ResponseBody
    public IResult addUserDemo(@RequestBody UserDemo userDemo) {
        userDemoService.adduserdemo(userDemo);
        return new ResultBean<String>("success");
    }

    @RequestMapping(value = "/findById.do", method = RequestMethod.POST)
    @ResponseBody
    public IResult findById(Integer id) {
        return new ResultBean<UserDemo>(userDemoService.findById(id));
    }

    @RequestMapping(value = "/updateUserDemo.do", method = RequestMethod.POST)
    @ResponseBody
    public IResult updateUserDemo(@RequestBody UserDemo userDemo) {
        userDemoService.updateuser(userDemo);
        return new ResultBean<String>("success");
    }

    @RequestMapping(value = "/deleteUserDemo.do", method = RequestMethod.POST)
    @ResponseBody
    public IResult updateUserDemo(Integer id) {
        userDemoService.deleteUserDemo(id);
        return new ResultBean<String>("success");
    }

}
