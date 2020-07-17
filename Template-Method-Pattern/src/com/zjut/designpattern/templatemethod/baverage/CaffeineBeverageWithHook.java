package com.zjut.designpattern.templatemethod.baverage;

/**
 * @author zjxjwxk
 * @date 2020/7/17 11:56 上午
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * 模版方法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * 抽象方法需要子类实现
     */
    abstract void brew();

    abstract void addCondiments();

    /**
     * 子类共有的方法实现
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Hook方法
     * 缺省实现为需要调料，子类根据实际决定是否需要调料
     * @return 顾客是否需要调料
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
