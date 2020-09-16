package Section_6.Lesson2;

import javax.swing.*;
import java.awt.*;

public class Lesson2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Новая программа");
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(size);
        //frame.setBounds(0,0,size.width,size.height);
        frame.setLocation(0,0);
        frame.setSize(size);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}