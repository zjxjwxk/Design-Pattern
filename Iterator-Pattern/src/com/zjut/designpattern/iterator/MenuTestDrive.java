package com.zjut.designpattern.iterator;

import com.zjut.designpattern.iterator.menu.CafeMenu;
import com.zjut.designpattern.iterator.menu.DinerMenu;
import com.zjut.designpattern.iterator.menu.Menu;
import com.zjut.designpattern.iterator.menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/7/22 1:53 下午
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        List<Menu> menus = new ArrayList<>();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
