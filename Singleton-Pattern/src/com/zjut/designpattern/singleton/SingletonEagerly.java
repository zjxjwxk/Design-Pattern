package com.zjut.designpattern.singleton;

/**
 * 急切实例化
 * 总是要创建并使用该单件，或者在创建和运行时的负担不太重
 * @author zjxjwxk
 * @date 2020-07-03 22:56
 */
public class SingletonEagerly {

    private static SingletonEagerly uniqueInstance = new SingletonEagerly();

    private SingletonEagerly() {

    }

    public static SingletonEagerly getInstance() {
        return uniqueInstance;
    }
}
