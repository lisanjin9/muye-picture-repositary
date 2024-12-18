package com.muye.muyepicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.muye.muyepicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true) //开启aop 增强代理
public class MuyePictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuyePictureBackendApplication.class, args);
    }

}
