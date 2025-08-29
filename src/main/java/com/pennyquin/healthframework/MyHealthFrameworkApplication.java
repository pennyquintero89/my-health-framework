package com.pennyquin.healthframework;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(
        nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
        basePackages = {"com.pennyquin.openapi", "com.pennyquin.openapi.api", "com.pennyquin.openapi.configuration"},
        nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class MyHealthFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHealthFrameworkApplication.class, args);
    }

    @Bean(name = "com.pennyquin.openapi.MyHealthFrameworkApplication.jsonNullableModule")
    public Module jsonNullableModule() {
        return new JsonNullableModule();
    }

}
