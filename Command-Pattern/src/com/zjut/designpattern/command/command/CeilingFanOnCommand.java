package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.CeilingFan;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:38
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
