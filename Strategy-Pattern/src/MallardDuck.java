import behavior.impl.FlyWithWings;
import behavior.impl.Quack;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:06
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
