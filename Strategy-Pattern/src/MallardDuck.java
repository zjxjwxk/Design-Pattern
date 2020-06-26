import behavior.impl.FlyWithWings;
import behavior.impl.Quack;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:06
 */
public class MallardDuck extends Duck {

    /**
     * 构造函数设置呱呱叫和飞行方式
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
