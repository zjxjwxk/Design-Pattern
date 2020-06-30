package com.zjut.designpattern.factory.store;

import com.zjut.designpattern.factory.pizza.ChicagoStyleCheesePizza;
import com.zjut.designpattern.factory.pizza.Pizza;

/**
 * @author zjxjwxk
 * @date 2020-06-30 12:05
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
