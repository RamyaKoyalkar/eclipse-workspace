package com.wipro.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Spring Boot SpringApplication class is used to bootstrap and launch a Spring application from a Java main method. 
This class automatically creates the ApplicationContext from the classpath, 
scan the configuration classes and launch the application.

It is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration 
and component scanning. 
It’s same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
*/


@SpringBootApplication
public class SpringbootInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInventoryApplication.class, args);
	}

}
