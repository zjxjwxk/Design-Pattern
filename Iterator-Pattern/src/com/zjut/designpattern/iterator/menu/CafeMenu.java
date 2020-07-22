package com.zjut.designpattern.iterator.menu;

import com.zjut.designpattern.iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zjxjwxk
 * @date 2020/7/22 5:01 下午
 */
public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new Hashtable<>();
    String name;

    public CafeMenu(String name) {
        this.name = name;

        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

    @Override
    public String getName() {
        return name;
    }
}
