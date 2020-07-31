package com.zjut.designpattern.proxy.virtual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author zjxjwxk
 * @date 2020/7/31 7:54 下午
 */
public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame jFrame = new JFrame("CD Cover Viewer");
    JMenuBar jMenuBar;
    JMenu jMenu;
    Hashtable<String, String> cds = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");

        URL initialURL = new URL(cds.get("Selected Ambient Works, Vol. 2"));
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("Favorite CDs");
        jMenuBar.add(jMenu);
        jFrame.setJMenuBar(jMenuBar);

        Enumeration<String> e = cds.keys();
        while (e.hasMoreElements()) {
            String name = e.nextElement();
            JMenuItem jMenuItem = new JMenuItem(name);
            jMenu.add(jMenuItem);
            jMenuItem.addActionListener(e1 -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(name)));
                jFrame.repaint();
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        jFrame.getContentPane().add(imageComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }

    private URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
