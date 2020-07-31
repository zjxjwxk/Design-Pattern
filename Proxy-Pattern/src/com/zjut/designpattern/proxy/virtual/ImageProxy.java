package com.zjut.designpattern.proxy.virtual;

import com.zjut.designpattern.proxy.virtual.icon.LoadingIcon;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author zjxjwxk
 * @date 2020/7/31 4:44 下午
 */
public class ImageProxy implements Icon {

    volatile Icon icon;

    final URL imageURL;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
        icon = new LoadingIcon(this, imageURL);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        icon.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return icon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return icon.getIconHeight();
    }

    synchronized public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
