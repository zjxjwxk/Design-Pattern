package com.zjut.designpattern.factory.ingredient.factory;

import com.zjut.designpattern.factory.ingredient.*;

/**
 * 原料工厂
 * 属于抽象工厂，使用对象组合
 * 创建相关的对象家族
 * @author zjxjwxk
 * @date 2020-07-01 23:48
 */
public interface PizzaIngredientFactory {

    /*
    生产各种产品的工厂方法（抽象工厂往往又使用了工厂方法）
     */

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
