package com.cts.pointsmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan("com")
public class PointsMicroserviceApplication  extends SpringBootServletInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(PointsMicroserviceApplication.class);
	public static void main(String[] args) {
		LOGGER.info("Inside Points Microservice");
		SpringApplication.run(PointsMicroserviceApplication.class, args);
	}
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources( PointsMicroserviceApplication.class);
	 }

}
