package com.lmy.controller;

import com.lmy.annotation.Log;
import com.lmy.annotation.LogTypeEnum;
import com.lmy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhao.wang
 */
@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping(value = "log", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Log(prefix = "日志测试接口", value = LogTypeEnum.PARAMETER)
    public Object sendMsg() {
        logService.log();
        return "发送成";
    }

    @RequestMapping(value = "log", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Log(prefix = "日志测试接口", value = LogTypeEnum.RESULT)
    public Object sendResultMsg() {
        logService.log();
        return "发送成";
    }

}