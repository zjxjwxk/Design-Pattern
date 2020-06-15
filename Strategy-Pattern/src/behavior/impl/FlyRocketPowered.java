package behavior.impl;

import behavior.FlyBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:28
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
