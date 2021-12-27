package com.imooc.follow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imooc.follow.mapper")
public class FollowApplication {
    public static void main(String[] args) {
        SpringApplication.run(FollowApplication.class,args);
    }
}

