package com.hepo.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hepo.code.mapper")
public class JavaCoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCoderApplication.class, args);
    }

}
