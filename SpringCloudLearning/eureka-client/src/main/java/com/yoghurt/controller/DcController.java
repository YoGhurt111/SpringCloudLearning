package com.yoghurt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 2017/6/23.
 */
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Value("${server.port}")
    String port;

    @GetMapping("/dc") // 相当于@RequestMapping(value = "/dc", method = RequestMethod.GET)
    public String dc(){
        return "hi,i'm eureka-client,my port is" + port;
    }
}
