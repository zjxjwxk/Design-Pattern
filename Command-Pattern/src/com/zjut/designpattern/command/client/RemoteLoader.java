package com.zjut.designpattern.command.client;

import com.zjut.designpattern.command.command.*;
import com.zjut.designpattern.command.invoker.RemoteControl;
import com.zjut.designpattern.command.receiver.CeilingFan;
import com.zjut.designpattern.command.receiver.GarageDoor;
import com.zjut.designpattern.command.receiver.Light;
import com.zjut.designpattern.command.receiver.Stereo;

/**
 * Client
 * @author zjxjwxk
 * @date 2020-07-06 20:34
 */
public class RemoteLoader {

    public static void main(String[] args) {
        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Receiver
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Home");
        Stereo stereo = new Stereo("Living Room");

        // Command
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, ceilingFanHighCommand, garageDoorUp, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, garageDoorDown, stereoOff};

        // Macro Command
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHighCommand, ceilingFanOff);
        remoteControl.setCommand(3, ceilingFanMediumCommand, ceilingFanOff);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(3);

        System.out.println("------ Pushing Macro On ------");
        remoteControl.onButtonWasPushed(6);
        System.out.println("------ Pushing Macro Off ------");
        remoteControl.offButtonWasPushed(6);
    }
}
