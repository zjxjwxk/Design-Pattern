package com.zjut.designpattern.proxy.remote.client;

import com.zjut.designpattern.proxy.remote.api.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @author zjxjwxk
 * @date 2020/7/31 2:20 下午
 */
public class GumballMonitor {

    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineRemote.getLocation());
            System.out.println("Current inventory: " + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
