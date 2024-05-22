package com.taotao.orangebackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@MapperScan("com.taotao.orangebackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.taotao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.taotao.orangebackendserviceclient.service"})
public class OrangeBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangeBackendUserServiceApplication.class, args);
    }

}
