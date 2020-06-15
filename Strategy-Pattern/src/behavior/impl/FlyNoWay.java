package behavior.impl;

import behavior.FlyBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 20:58
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
