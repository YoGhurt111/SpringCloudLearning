package com.yoghurt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by admin on 2017/6/23.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(EurekaServerApplication.class)
                .web(true).run(args);
    }
}
