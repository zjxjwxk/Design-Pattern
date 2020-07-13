package com.zjut.designpattern.adapter;

import com.zjut.designpattern.adapter.adapter.TurkeyAdapter;
import com.zjut.designpattern.adapter.impl.MallardDuck;
import com.zjut.designpattern.adapter.impl.WildTurkey;

/**
 * @author zjxjwxk
 * @date 2020/7/13 9:57 上午
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
