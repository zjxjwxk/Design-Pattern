package com.zjut.designpattern.decorator.beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:51
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
