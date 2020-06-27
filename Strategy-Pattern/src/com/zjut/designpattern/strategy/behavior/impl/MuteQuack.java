package com.zjut.designpattern.strategy.behavior.impl;

import com.zjut.designpattern.strategy.behavior.QuackBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 20:58
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
