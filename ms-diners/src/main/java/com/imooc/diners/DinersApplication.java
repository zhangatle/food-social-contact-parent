package com.imooc.diners;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imooc.diners.mapper")
public class DinersApplication {
    public static void main(String[] args) {
        SpringApplication.run(DinersApplication.class, args);
    }
}
