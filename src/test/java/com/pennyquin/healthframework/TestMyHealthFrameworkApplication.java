package com.pennyquin.healthframework;

import org.springframework.boot.SpringApplication;

public class TestMyHealthFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.from(MyHealthFrameworkApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
