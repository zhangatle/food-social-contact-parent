package com.imooc.feeds;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imooc.feeds.mapper")
public class FeedsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeedsApplication.class,args);
    }
}
