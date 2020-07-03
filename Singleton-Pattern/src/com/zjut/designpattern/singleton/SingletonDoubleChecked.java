package com.zjut.designpattern.singleton;

/**
 * 双重检查加锁
 * 如果性能要求高，可以极大减少getInstance()的时间耗费
 * @author zjxjwxk
 * @date 2020-07-03 22:59
 */
public class SingletonDoubleChecked {

    private volatile static SingletonDoubleChecked uniqueInstance;

    private SingletonDoubleChecked() {

    }

    public static SingletonDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
        }
        return uniqueInstance;
    }
}
