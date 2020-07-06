package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.GarageDoor;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:41
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
