package com.zjut.designpattern.decorator.condiment;

import com.zjut.designpattern.decorator.beverage.Beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 21:55
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
