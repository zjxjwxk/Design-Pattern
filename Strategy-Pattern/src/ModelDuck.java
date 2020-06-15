import behavior.impl.FlyNoWay;
import behavior.impl.Quack;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:20
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
