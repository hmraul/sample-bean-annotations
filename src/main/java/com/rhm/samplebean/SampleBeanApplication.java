package com.rhm.samplebean;

import com.rhm.samplebean.domain.entities.ShapeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.rhm.samplebean.configuration")
public class SampleBeanApplication {

	@Autowired
	private static ShapeFactory shapeFactory;

	public SampleBeanApplication(ShapeFactory shapeFactory) {
		this.shapeFactory = shapeFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleBeanApplication.class, args);


		System.out.println("------------------------------------");
		System.out.println(shapeFactory.getShape(1).whoAmI());
		System.out.println(shapeFactory.getShape(2).whoAmI());
		System.out.println("------------------------------------");


	}

}
