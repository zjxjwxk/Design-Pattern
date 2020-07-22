package com.zjut.designpattern.composite;

import com.zjut.designpattern.composite.menu.MenuComponent;

import java.util.Iterator;

/**
 * @author zjxjwxk
 * @date 2020/7/22 8:42 下午
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent menus) {
        this.allMenus = menus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
