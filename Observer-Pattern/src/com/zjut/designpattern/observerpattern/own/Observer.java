package com.zjut.designpattern.observerpattern.own;

/**
 * @author zjxjwxk
 * @date 2020-06-26 19:52
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
