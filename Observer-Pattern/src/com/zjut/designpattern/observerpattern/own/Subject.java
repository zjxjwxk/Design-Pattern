package com.zjut.designpattern.observerpattern.own;

/**
 * @author zjxjwxk
 * @date 2020-06-26 19:52
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
