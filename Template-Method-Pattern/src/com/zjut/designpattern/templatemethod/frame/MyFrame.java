package com.zjut.designpattern.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author zjxjwxk
 * @date 2020/7/17 9:29 下午
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    /**
     * Hook（钩子）
     * 默认什么都不做
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
