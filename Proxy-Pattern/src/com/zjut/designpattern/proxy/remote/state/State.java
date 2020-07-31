package com.zjut.designpattern.proxy.remote.state;

import java.io.Serializable;

/**
 * @author zjxjwxk
 * @date 2020/7/24 12:39 下午
 */
public interface State extends Serializable {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
