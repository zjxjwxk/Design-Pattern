package com.zjut.designpattern.iterator.iterator;

import com.zjut.designpattern.iterator.MenuItem;

import java.util.Iterator;

/**
 * @author zjxjwxk
 * @date 2020/7/22 12:20 下午
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item" +
                    " until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < list.length - 1; ++i) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
