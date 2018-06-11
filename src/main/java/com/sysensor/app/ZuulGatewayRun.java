package com.sysensor.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.MalformedURLException;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableSwagger2
public class ZuulGatewayRun {

    public static void main(String[] args) throws MalformedURLException {
        SpringApplication.run(ZuulGatewayRun.class, args);
    }

}
