package com.cupk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@MapperScan("com.cupk.mapper")
@EnableTransactionManagement
public class MentalHealthSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(MentalHealthSystemApplication.class, args);
    }
}