package com.taotao.orangebackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.taotao.orangebackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.taotao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.taotao.orangebackendserviceclient.service"})
public class OrangeBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangeBackendQuestionServiceApplication.class, args);
    }

}
