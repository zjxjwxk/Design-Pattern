package com.zjut.designpattern.singleton;

/**
 * 同步getInstance()方法
 * 如果没有性能考虑，这是最直接的做法
 * @author zjxjwxk
 * @date 2020-07-03 22:50
 */
public class SingletonSync {

    private static SingletonSync uniqueInstance;

    private SingletonSync() {

    }

    public static synchronized SingletonSync getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }
}
