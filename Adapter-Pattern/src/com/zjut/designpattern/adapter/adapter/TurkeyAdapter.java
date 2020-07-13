package com.zjut.designpattern.adapter.adapter;

import com.zjut.designpattern.adapter.Duck;
import com.zjut.designpattern.adapter.Turkey;

/**
 * 火鸡适配器
 * Turkey转Duck
 * @author zjxjwxk
 * @date 2020/7/13 9:55 上午
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 火鸡飞得慢，飞五次相当于鸭子一次
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
