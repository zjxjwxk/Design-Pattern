package com.zjut.designpattern.iterator.menu;

import com.zjut.designpattern.iterator.MenuItem;

import java.util.Iterator;

/**
 * @author zjxjwxk
 * @date 2020/7/22 2:32 下午
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
