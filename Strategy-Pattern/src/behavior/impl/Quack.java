package behavior.impl;

import behavior.QuackBehavior;

/**
 * @author zjxjwxk
 * @date 2020/6/15 20:58
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
