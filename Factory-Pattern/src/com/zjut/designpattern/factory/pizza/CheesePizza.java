package com.zjut.designpattern.factory.pizza;

import com.zjut.designpattern.factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @author zjxjwxk
 * @date 2020-07-02 00:22
 */
public class CheesePizza extends Pizza {

    /**
     * 组合抽象工厂
     */
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 利用实例化时传入的原料工厂实现类，来生产和准备具体原料
     */
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
