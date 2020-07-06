package com.zjut.designpattern.command.receiver;

/**
 * @author zjxjwxk
 * @date 2020-07-06 13:42
 */
public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }
}
