package com.zjut.designpattern.proxy;

/**
 * @author zjxjwxk
 * @date 2020/7/30 3:04 下午
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
