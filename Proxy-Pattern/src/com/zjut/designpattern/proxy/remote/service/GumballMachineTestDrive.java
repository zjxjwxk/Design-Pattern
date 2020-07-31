package com.zjut.designpattern.proxy.remote.service;

import com.zjut.designpattern.proxy.remote.api.GumballMachineRemote;

import java.rmi.Naming;

/**
 * @author zjxjwxk
 * @date 2020/7/31 1:33 下午
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachineRemote = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
