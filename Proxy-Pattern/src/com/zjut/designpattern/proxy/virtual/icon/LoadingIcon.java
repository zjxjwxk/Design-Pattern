package com.zjut.designpattern.proxy.virtual.icon;

import com.zjut.designpattern.proxy.virtual.ImageProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author zjxjwxk
 * @date 2020/7/31 5:17 下午
 */
public class LoadingIcon implements Icon {

    ImageProxy imageProxy;

    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public LoadingIcon(ImageProxy imageProxy, URL imageURL) {
        this.imageProxy = imageProxy;
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
        if (!retrieving) {
            retrieving = true;
            retrievalThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        imageProxy.setIcon(new ReadyIcon(new ImageIcon(imageURL, "CD Cover")));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            retrievalThread.start();
        }
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }
}
