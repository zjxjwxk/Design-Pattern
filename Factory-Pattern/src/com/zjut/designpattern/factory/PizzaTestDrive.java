package com.zjut.designpattern.factory;

import com.zjut.designpattern.factory.pizza.Pizza;
import com.zjut.designpattern.factory.store.ChicagoPizzaStore;
import com.zjut.designpattern.factory.store.NYPizzaStore;
import com.zjut.designpattern.factory.store.PizzaStore;

/**
 * @author zjxjwxk
 * @date 2020-06-30 11:51
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        // PizzaStore使用了工厂方法，可以实例化具体子类工厂，来订购不同Pizza
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
