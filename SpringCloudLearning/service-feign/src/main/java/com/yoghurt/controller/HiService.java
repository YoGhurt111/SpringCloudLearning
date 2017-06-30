package com.yoghurt.controller;

import com.yoghurt.hystrix.HiServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2017/6/29.
 */
@FeignClient(value = "eureka-client",fallback = HiServiceHystrix.class)
public interface HiService {
    @GetMapping(value = "/dc")
    String sayHiFromClientOne();
}
