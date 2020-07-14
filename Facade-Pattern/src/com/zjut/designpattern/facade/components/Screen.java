package com.zjut.designpattern.facade.components;

/**
 * @author zjxjwxk
 * @date 2020/7/14 12:33 下午
 */
public class Screen {

    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }

    @Override
    public String toString() {
        return description;
    }
}
