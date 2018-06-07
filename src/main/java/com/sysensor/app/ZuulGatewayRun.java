package com.sysensor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import java.net.MalformedURLException;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulGatewayRun {

    public static void main(String[] args) throws MalformedURLException {

        SpringApplication.run(ZuulGatewayRun.class, args);

    }

}
