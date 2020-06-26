import behavior.impl.FlyRocketPowered;

/**
 * @author zjxjwxk
 * @date 2020/6/15 21:13
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        // 通过构造函数设置呱呱叫和飞行方式
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        // 通过构造函数设置（不会飞）
        model.performFly();
        // 通过set方法设置（火箭飞行）
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
