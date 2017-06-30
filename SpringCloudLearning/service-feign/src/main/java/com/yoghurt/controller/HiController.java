package com.yoghurt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/6/29.
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(){
        return hiService.sayHiFromClientOne();
    }
}
