package com.zjut.designpattern.composite.menu;

import com.zjut.designpattern.composite.iterator.CompositeIterator;
import com.zjut.designpattern.composite.iterator.NullIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/7/22 8:35 下午
 */
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
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
    public void print() {
        System.out.print("\n" + name);
        System.out.println(", " + description);
        System.out.println("----------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
