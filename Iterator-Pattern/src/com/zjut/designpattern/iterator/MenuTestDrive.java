package com.zjut.designpattern.iterator;

import com.zjut.designpattern.iterator.menu.DinerMenu;
import com.zjut.designpattern.iterator.menu.PancakeHouseMenu;

/**
 * @author zjxjwxk
 * @date 2020/7/22 1:53 下午
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
