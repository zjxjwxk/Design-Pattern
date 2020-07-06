package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.Stereo;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:21
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
