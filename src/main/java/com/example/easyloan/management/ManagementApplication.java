package com.example.easyloan.management;

import com.example.easyloan.management.Model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.config.CacheManagementConfigUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementApplication.class, args);

    }



}
