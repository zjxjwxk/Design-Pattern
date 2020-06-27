package com.zjut.designpattern.decorator.condiment;

import com.zjut.designpattern.decorator.beverage.Beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:55
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
