package com.zjut.designpattern.strategypattern;

import com.zjut.designpattern.strategypattern.behavior.impl.FlyNoWay;
import com.zjut.designpattern.strategypattern.behavior.impl.Quack;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:20
 */
public class ModelDuck extends Duck {

    /**
     * 构造函数设置默认飞行（不会飞）和呱呱叫方式
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
