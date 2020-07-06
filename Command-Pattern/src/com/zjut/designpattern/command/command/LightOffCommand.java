package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.Light;

/**
 * @author zjxjwxk
 * @date 2020-07-06 17:49
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
