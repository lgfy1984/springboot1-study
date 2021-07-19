package com.lmy.controller;

import com.lmy.entity.Result;
import com.lmy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {
    @Autowired
    PersonService personService;

    @RequestMapping("/semaphore")
    public Result semaphore() {

        return personService.semaphore("");
    }

    @RequestMapping("/thread")
    public Result thread() {

        return personService.thread("");
    }

}