package com.lmy.di.controller;

import com.lmy.di.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author yuhao.wang3
 * @since 2019/8/31 13:28
 */
@Controller
public class User2Controller {

    @Value("${host:localhost}")
    private String host;

    @Autowired
    private UserService userService;

    public void println() {
        System.out.println("=============================>:" + userService);
    }

//    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
