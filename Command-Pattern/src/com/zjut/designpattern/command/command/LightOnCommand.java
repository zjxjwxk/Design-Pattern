package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.Light;

/**
 * @author zjxjwxk
 * @date 2020-07-06 13:42
 */
public class LightOnCommand implements Command {

    /**
     * Receiver
     */
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
