package com.zjut.designpattern.factory.store;

import com.zjut.designpattern.factory.pizza.Pizza;

/**
 * 披萨工厂
 * 属于工厂方法，使用继承
 * 把对象的创建委托给子类，子类实现工厂方法来创建对象
 * @author zjxjwxk-
 * @date 2020-06-30 11:51
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // 调用PizzaStore的createPizza()工厂方法，来创建具体Pizza子类，
        // 需要PizzaStore子类具体实现，其创建的Pizza子类组合了具体的原料工厂
        pizza = createPizza(type);

        // 调用Pizza的prepare()工厂方法，来准备具体原料，
        // 需要Pizza子类具体实现，通过组合的具体原料工厂来准备具体原料
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 工厂方法（通过子类继承来具体实现）
     * @param type Pizza类型字符串
     * @return Pizza子类
     */
    abstract Pizza createPizza(String type);
}
