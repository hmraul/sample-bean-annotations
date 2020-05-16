package com.rhm.samplebean.configuration;

import com.rhm.samplebean.domain.entities.Circle;
import com.rhm.samplebean.domain.entities.Shape;
import com.rhm.samplebean.domain.entities.Square;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapesConfiguration {

    @Bean(name = "square")
    public Shape square() {
      return new Square();
    }

    @Bean(name = "circle")
    public Shape circle() {
        return new Circle();
    }

}
