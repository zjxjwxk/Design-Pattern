package com.zjut.designpattern.adapter.duck.impl;

import com.zjut.designpattern.adapter.duck.Turkey;

/**
 * @author zjxjwxk
 * @date 2020/7/13 9:54 上午
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
