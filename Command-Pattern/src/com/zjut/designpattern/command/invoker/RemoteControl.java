package com.zjut.designpattern.command.invoker;

import com.zjut.designpattern.command.command.NoCommand;
import com.zjut.designpattern.command.command.Command;

/**
 * 遥控器
 * @author zjxjwxk
 * @date 2020-07-06 17:40
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot" + i + "] " + onCommands[i].getClass().getName() +
                    "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
