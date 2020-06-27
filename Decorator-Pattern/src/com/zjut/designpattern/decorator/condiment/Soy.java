package com.zjut.designpattern.decorator.condiment;

import com.zjut.designpattern.decorator.beverage.Beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:55
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
