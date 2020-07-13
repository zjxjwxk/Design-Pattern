package com.zjut.designpattern.adapter.iterator;

import com.zjut.designpattern.adapter.iterator.adapter.EnumerationIterator;

import java.util.*;

/**
 * @author zjxjwxk
 * @date 2020/7/13 3:56 下午
 */
public class EnumerationIteratorTest {

    public static void main(String[] args) {
        Vector<Integer> integerVector = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        Iterator enumerationIterator = new EnumerationIterator(integerVector.elements());
        while (enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }
    }
}
