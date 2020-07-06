package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.GarageDoor;

/**
 * @author zjxjwxk
 * @date 2020-07-06 15:31
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
