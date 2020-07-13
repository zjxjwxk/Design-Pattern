package com.zjut.designpattern.adapter.adapter;

import com.zjut.designpattern.adapter.Duck;
import com.zjut.designpattern.adapter.Turkey;

import java.util.Random;

/**
 * 鸭子适配器
 * Duck转Turkey
 * @author zjxjwxk
 * @date 2020/7/13 10:13 上午
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // 火鸡飞得慢，平均五次只飞一次，速度是鸭子的1/5
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
