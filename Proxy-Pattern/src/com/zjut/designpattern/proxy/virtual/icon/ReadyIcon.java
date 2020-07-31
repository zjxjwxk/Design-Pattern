package com.zjut.designpattern.proxy.virtual.icon;

import javax.swing.*;
import java.awt.*;

/**
 * @author zjxjwxk
 * @date 2020/7/31 5:17 下午
 */
public class ReadyIcon implements Icon {

    ImageIcon imageIcon;

    public ReadyIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }
}
