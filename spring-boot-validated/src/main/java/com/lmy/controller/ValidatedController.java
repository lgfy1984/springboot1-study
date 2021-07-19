package com.lmy.controller;

import com.lmy.param.InputParam;
import com.lmy.service.ValidatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuhao.wang
 */
@RestController
public class ValidatedController {

    @Autowired
    private ValidatedService validatedService;

    @PostMapping("validated")
    public String validatedTest(@Validated(InputParam.ParameterGroup1.class) InputParam inputParam) {

        return validatedService.validatedTest(inputParam);
    }
}