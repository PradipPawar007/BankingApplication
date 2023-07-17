package com.easybyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.easybyte.controller") //In case if we created our controller outside this package then we can use this annotation
public class EasyByteApplication {                                                

	public static void main(String[] args) {
		SpringApplication.run(EasyByteApplication.class, args);
	}

}
