package com.zjut.designpattern.adapter.iterator.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 迭代器适配器
 * 迭代器转枚举
 * @author zjxjwxk
 * @date 2020/7/13 4:31 下午
 */
public class IteratorEnumeration implements Enumeration {

    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
