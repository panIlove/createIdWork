package com.ll.snowflake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SnowflakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnowflakeApplication.class, args);
        System.out.println("项目启动完成" + new Date());
    }

}
