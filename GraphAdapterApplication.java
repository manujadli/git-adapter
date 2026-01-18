package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class GraphAdapterApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		logger.info("GraphAdapterApplication.main()  {} " , "some logger");
		SpringApplication.run(GraphAdapterApplication.class, args);
	}

}