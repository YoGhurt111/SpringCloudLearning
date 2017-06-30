package com.yoghurt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by admin on 2017/6/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ClientApplication.class)
                .web(true).run(args);
    }
}
