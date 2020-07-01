package com.zjut.designpattern.factory.ingredient.factory;

import com.zjut.designpattern.factory.ingredient.*;

/**
 * @author zjxjwxk
 * @date 2020-07-01 23:48
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
