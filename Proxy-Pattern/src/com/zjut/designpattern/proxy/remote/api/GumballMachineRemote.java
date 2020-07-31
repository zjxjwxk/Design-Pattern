package com.zjut.designpattern.proxy.remote.api;

import com.zjut.designpattern.proxy.remote.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author zjxjwxk
 * @date 2020/7/31 1:06 下午
 */
public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
