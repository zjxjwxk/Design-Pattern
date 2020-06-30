package com.zjut.designpattern.factory.store;

import com.zjut.designpattern.factory.pizza.Pizza;

/**
 * @author zjxjwxk
 * @date 2020-06-30 11:51
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
