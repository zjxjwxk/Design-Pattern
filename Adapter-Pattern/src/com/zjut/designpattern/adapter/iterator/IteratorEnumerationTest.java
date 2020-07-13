package com.zjut.designpattern.adapter.iterator;

import com.zjut.designpattern.adapter.iterator.adapter.IteratorEnumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/7/13 4:36 下午
 */
public class IteratorEnumerationTest {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Enumeration iteratorEnumeration = new IteratorEnumeration(integerList.iterator());
        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
