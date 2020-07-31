package com.zjut.designpattern.proxy.remote.client;

import com.zjut.designpattern.proxy.remote.api.GumballMachineRemote;

import java.rmi.Naming;

/**
 * @author zjxjwxk
 * @date 2020/7/31 2:22 下午
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {
                "rmi://localhost/gumballmachine"
        };

        GumballMonitor[] gumballMonitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote gumballMachineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                gumballMonitors[i] = new GumballMonitor(gumballMachineRemote);
                System.out.println(gumballMonitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < gumballMonitors.length; i++) {
            gumballMonitors[i].report();
        }
    }
}
