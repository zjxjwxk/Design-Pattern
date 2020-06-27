package com.zjut.designpattern.strategy;

import com.zjut.designpattern.strategy.behavior.FlyBehavior;
import com.zjut.designpattern.strategy.behavior.QuackBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 20:58
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
