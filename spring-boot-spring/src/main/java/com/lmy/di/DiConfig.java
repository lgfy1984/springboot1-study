package com.lmy.di;

import com.lmy.di.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuhao.wang3
 * @since 2019/8/30 15:07
 */
@Configuration
@ComponentScan({"com.lmy.di"})
public class DiConfig {

    @Bean
    public UserService userService2() {
        UserService userService = new UserService();
        userService.setId(2);
        return userService;
    }

}
