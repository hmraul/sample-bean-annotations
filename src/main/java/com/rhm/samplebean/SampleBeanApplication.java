package com.rhm.samplebean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.rhm.samplebean.configuration")
public class SampleBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleBeanApplication.class, args);
	}

}
