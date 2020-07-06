package com.zjut.designpattern.command.client;

import com.zjut.designpattern.command.invoker.SimpleRemoteControl;
import com.zjut.designpattern.command.command.GarageDoorOpenCommand;
import com.zjut.designpattern.command.command.LightOnCommand;
import com.zjut.designpattern.command.receiver.GarageDoor;
import com.zjut.designpattern.command.receiver.Light;

/**
 * Client
 * @author zjxjwxk
 * @date 2020-07-06 13:48
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        // Invoker
        SimpleRemoteControl control = new SimpleRemoteControl();

        // Receiver
        Light light = new Light("");
        // Command
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        // Receiver
        GarageDoor garageDoor = new GarageDoor("");
        // Command
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        control.setCommand(lightOnCommand);
        control.buttonWasPressed();

        control.setCommand(garageDoorOpenCommand);
        control.buttonWasPressed();
    }
}
