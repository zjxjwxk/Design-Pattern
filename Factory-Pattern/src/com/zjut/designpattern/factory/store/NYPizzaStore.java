package com.zjut.designpattern.factory.store;

import com.zjut.designpattern.factory.pizza.NYStyleCheesePizza;
import com.zjut.designpattern.factory.pizza.Pizza;

/**
 * @author zjxjwxk
 * @date 2020-06-30 11:59
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
