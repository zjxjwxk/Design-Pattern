package com.zjut.designpattern.adapter.iterator.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 枚举适配器
 * 枚举转迭代器
 * @author zjxjwxk
 * @date 2020/7/13 3:45 下午
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
