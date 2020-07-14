package com.zjut.designpattern.facade;

import com.zjut.designpattern.facade.facade.HomeTheaterFacade;
import com.zjut.designpattern.facade.components.*;

/**
 * @author zjxjwxk
 * @date 2020/7/14 2:14 下午
 */
public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        // 实例化组件
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        CdPlayer cdPlayer = new CdPlayer("Top-O-Line CD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");

        // 实例化外观
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);
        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();
    }
}
