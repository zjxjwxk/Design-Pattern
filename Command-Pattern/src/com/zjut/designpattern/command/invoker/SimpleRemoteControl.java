package com.zjut.designpattern.command.invoker;

import com.zjut.designpattern.command.command.Command;

/**
 * 简单遥控器
 * @author zjxjwxk
 * @date 2020-07-06 13:44
 */
public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
