package com.zjut.designpattern.iterator;

import com.zjut.designpattern.iterator.menu.Menu;

import java.util.Iterator;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/7/22 1:50 下午
 */
public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        System.out.print("MENU\n----");
        for (Menu menu : menus) {
            System.out.println("\n" + menu.getName());
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
