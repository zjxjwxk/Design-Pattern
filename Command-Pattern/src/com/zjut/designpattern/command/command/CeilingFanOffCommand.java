package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.CeilingFan;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:41
 */
public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
