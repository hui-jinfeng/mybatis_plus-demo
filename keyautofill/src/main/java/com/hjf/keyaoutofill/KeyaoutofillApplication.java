package com.hjf.keyaoutofill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hjf.keyaoutofill.mapper"})
public class KeyaoutofillApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyaoutofillApplication.class, args);
    }

}
