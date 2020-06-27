package com.zjut.designpattern.decorator.beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:53
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
