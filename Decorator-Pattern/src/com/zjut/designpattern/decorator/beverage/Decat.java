package com.zjut.designpattern.decorator.beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:51
 */
public class Decat extends Beverage {

    public Decat() {
        description = "Decat Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
