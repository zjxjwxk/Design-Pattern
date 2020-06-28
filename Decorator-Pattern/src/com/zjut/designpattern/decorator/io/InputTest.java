package com.zjut.designpattern.decorator.io;

import java.io.*;

/**
 * @author zjxjwxk
 * @date 2020-06-28 14:57
 */
public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
