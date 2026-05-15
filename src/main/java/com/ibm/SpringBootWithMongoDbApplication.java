package com.ibm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWithMongoDbApplication {
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWithMongoDbApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMongoDbApplication.class, args);
		System.out.println("Welcome to spring boot");
	}

}
