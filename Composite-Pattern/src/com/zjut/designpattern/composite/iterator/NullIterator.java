package com.zjut.designpattern.composite.iterator;

import com.zjut.designpattern.composite.menu.MenuComponent;

import java.util.Iterator;

/**
 * @author zjxjwxk
 * @date 2020/7/22 10:11 下午
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
