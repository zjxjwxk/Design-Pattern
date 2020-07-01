package com.zjut.designpattern.factory.pizza;

import com.zjut.designpattern.factory.ingredient.factory.PizzaIngredientFactory;

/**
 * @author zjxjwxk
 * @date 2020-07-02 00:22
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
