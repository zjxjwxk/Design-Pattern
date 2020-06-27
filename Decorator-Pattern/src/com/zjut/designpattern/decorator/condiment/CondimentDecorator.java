package com.zjut.designpattern.decorator.condiment;

import com.zjut.designpattern.decorator.beverage.Beverage;

/**
 * @author zjxjwxk
 * @date 2020-06-27 18:39
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
