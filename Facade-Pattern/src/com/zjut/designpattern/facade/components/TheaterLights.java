package com.zjut.designpattern.facade.components;

/**
 * @author zjxjwxk
 * @date 2020/7/14 12:34 下午
 */
public class TheaterLights {

    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    @Override
    public String toString() {
        return description;
    }
}
