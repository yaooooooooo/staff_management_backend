package com.accenture.staffmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.accenture.staffmanagement.dao")
public class StaffManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffManagementApplication.class, args);
    }

}