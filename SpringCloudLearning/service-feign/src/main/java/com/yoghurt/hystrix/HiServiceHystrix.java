package com.yoghurt.hystrix;


import com.yoghurt.controller.HiService;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/6/29.
 */
@Component
public class HiServiceHystrix implements HiService{

    @Override
    public String sayHiFromClientOne() {
        return "Sorry,error!";
    }
}
