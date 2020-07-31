package com.zjut.designpattern.proxy.virtual;

import javax.swing.*;
import java.awt.*;

/**
 * @author zjxjwxk
 * @date 2020/7/31 8:01 下午
 */
public class ImageComponent extends JComponent {

    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}
