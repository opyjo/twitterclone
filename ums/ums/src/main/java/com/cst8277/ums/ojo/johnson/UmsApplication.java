package com.cst8277.ums.ojo.johnson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Spring Boot applications should have an entry point class with the public static void main(String[] args)
// method,which is annotated with the @SpringBootApplication annotation and will be used to bootstrap the
//application.Spring Boot applications should have an entry point class with
//the public static void main(String[] args) method, which is annotated with the @SpringBootApplication
//annotation and will be used to bootstrap the application.
@SpringBootApplication
public class UmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmsApplication.class, args);
	}

}
