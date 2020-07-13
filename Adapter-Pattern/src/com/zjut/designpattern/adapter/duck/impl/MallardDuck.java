package com.zjut.designpattern.adapter.duck.impl;

import com.zjut.designpattern.adapter.duck.Duck;

/**
 * @author zjxjwxk
 * @date 2020/7/13 9:47 上午
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
