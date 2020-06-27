package com.zjut.designpattern.decorator.beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 18:37
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
