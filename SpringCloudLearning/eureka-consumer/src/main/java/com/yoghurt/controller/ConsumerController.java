package com.yoghurt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by admin on 2017/6/26.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    @HystrixCommand(fallbackMethod = "error")
    public String consumer(){

        String url = "http://eureka-client/dc";
        return restTemplate.getForObject(url, String.class);
    }

    public String error(){
        return "You have got error!";
    }
}
