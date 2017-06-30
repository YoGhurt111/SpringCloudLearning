package com.yoghurt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/6/30.
 */
@RestController
public class MainController {
    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/config")
    public String config() {
        return foo;
    }
}
