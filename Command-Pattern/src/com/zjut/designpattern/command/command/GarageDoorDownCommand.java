package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.GarageDoor;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:42
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
