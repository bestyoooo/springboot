package com.atguigu.controller;

import com.atguigu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setName("张三");
        user.setSex("男");
        user.setPassword("123456");
        user.setAge(18);
        return user;
    }
}
