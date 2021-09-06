package com.cloud.config;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringCloudConfigServerApplication.
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		
		System.out.println("hello");
	}

}
