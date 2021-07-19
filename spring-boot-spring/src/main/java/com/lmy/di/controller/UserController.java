package com.lmy.di.controller;

import com.lmy.di.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author yuhao.wang3
 * @since 2019/8/31 13:28
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void println() {
        System.out.println("=============================>:" + userService);
    }

    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
