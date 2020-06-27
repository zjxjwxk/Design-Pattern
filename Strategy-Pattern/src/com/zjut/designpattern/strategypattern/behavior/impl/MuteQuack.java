package com.zjut.designpattern.strategypattern.behavior.impl;

import com.zjut.designpattern.strategypattern.behavior.QuackBehavior;

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
