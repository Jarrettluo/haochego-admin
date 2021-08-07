package com.example.haochegoadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.haochegoadmin.mapper")
@SpringBootApplication
public class HaochegoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaochegoAdminApplication.class, args);
    }

}
