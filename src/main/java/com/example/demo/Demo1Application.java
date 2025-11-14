package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo1Application {

    public static void main(String[] args) {
        ApplicationContext context =new  AnnotationConfigApplicationContext(AppConfig.class);
        CAr cAr = context.getBean(CAr.class);
        cAr.drive();
    }

}
