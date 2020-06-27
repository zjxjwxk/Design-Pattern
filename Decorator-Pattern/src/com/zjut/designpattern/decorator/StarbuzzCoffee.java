package com.zjut.designpattern.decorator;

import com.zjut.designpattern.decorator.beverage.Beverage;
import com.zjut.designpattern.decorator.beverage.DarkRoast;
import com.zjut.designpattern.decorator.beverage.Espresso;
import com.zjut.designpattern.decorator.beverage.HouseBlend;
import com.zjut.designpattern.decorator.condiment.Mocha;
import com.zjut.designpattern.decorator.condiment.Soy;
import com.zjut.designpattern.decorator.condiment.Whip;

/**
 * @author zjxjwxk
 * @date 2020-06-27 22:02
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
