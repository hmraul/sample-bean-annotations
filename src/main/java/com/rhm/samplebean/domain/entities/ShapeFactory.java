package com.rhm.samplebean.domain.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    @Autowired
    @Qualifier("square")
    private final Shape square;

    @Autowired
    @Qualifier("circle")
    private final Shape circle;

    private final Map<Integer, Shape> SHAPES = new HashMap<>();


    public ShapeFactory(Shape square, Shape circle) {
        this.square = square;
        this.circle = circle;

        SHAPES.put(1, square);
        SHAPES.put(2, circle);
    }

    public Shape getShape(int identifier) {
        return SHAPES.get(identifier);
    }
}
