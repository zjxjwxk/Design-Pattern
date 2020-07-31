package com.zjut.designpattern.proxy.remote.service;

import com.zjut.designpattern.proxy.remote.api.GumballMachineRemote;
import com.zjut.designpattern.proxy.remote.state.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author zjxjwxk
 * @date 2020/7/31 1:26 下午
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    String location;
    int count;

    public GumballMachine(String location, int count) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.state = soldOutState;
        this.location = location;
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    @Override
    public State getState() {
        System.out.println("Method getState() is called");
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public int getCount() {
        System.out.println("Method getCount() is called");
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getLocation() throws RemoteException {
        System.out.println("Method getLocation() is called");
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
