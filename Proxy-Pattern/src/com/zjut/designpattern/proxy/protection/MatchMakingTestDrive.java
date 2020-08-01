package com.zjut.designpattern.proxy.protection;

import com.zjut.designpattern.proxy.protection.handler.NonOwnerInvocationHandler;
import com.zjut.designpattern.proxy.protection.handler.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author zjxjwxk
 * @date 2020/8/1 11:19 上午
 */
public class MatchMakingTestDrive {

    PersonBean personBean;

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();
    }

    public MatchMakingTestDrive() {
        personBean = new PersonBeanImpl();
        personBean.setName("Wxk");
        personBean.setGender("Male");
        personBean.setInterests("Coding");
        personBean.setHotOrNotRating(5);
    }

    public void drive() {
        PersonBean ownerProxy = getOwnerProxy(personBean);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("Playing DotA");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(personBean);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Playing Basketball");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
