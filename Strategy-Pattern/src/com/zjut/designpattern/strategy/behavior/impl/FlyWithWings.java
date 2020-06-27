package com.zjut.designpattern.strategy.behavior.impl;

import com.zjut.designpattern.strategy.behavior.FlyBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 20:58
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
