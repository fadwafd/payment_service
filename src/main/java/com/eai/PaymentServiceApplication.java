package com.eai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.eai.openfeignservice")
@ComponentScan(basePackages = "com.eai.config")
public class PaymentServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}