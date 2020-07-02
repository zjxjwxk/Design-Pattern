package com.zjut.designpattern.factory.store;

import com.zjut.designpattern.factory.ingredient.factory.NYPizzaIngredientFactory;
import com.zjut.designpattern.factory.ingredient.factory.PizzaIngredientFactory;
import com.zjut.designpattern.factory.pizza.*;

/**
 * @author zjxjwxk
 * @date 2020-06-30 11:59
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(type)) {
            // 传入抽象工厂（原料工厂）
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
