package com.zjut.designpattern.decorator.beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:51
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
