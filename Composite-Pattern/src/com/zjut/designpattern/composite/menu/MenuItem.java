package com.zjut.designpattern.composite.menu;

import com.zjut.designpattern.composite.iterator.NullIterator;

import java.util.Iterator;

/**
 * @author zjxjwxk
 * @date 2020/7/22 8:31 下午
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (vegetarian) {
            System.out.print("(v)");
        }
        System.out.println(", " + price);
        System.out.println("     -- " + description);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
