package com.computer.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest1Application.class, args);
        System.out.println("hot 第一次修改");
        System.out.println("hot 第二次修改");
        System.out.println("hot 第三次修改..............");
        
    }

}
