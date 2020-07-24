package com.zjut.designpattern.state.state;

/**
 * @author zjxjwxk
 * @date 2020/7/24 12:39 下午
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
