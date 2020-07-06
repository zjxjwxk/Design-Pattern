package com.zjut.designpattern.command.command;

import com.zjut.designpattern.command.receiver.Stereo;

/**
 * @author zjxjwxk
 * @date 2020-07-06 20:42
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
