package Section_6.Lesson6.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Вид");
        JMenu winSize = new JMenu("Размер окна");
        JMenuItem small = new JMenuItem("640x480");
        JMenuItem middle = new JMenuItem("800x600");
        JMenuItem big = new JMenuItem("1024x768");
        winSize.add(small);
        winSize.add(middle);
        winSize.add(big);
        main.add(winSize);
        mb.add(main);

        small.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBounds(400,200,640,480);
            }
        });
        middle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBounds(300,70,800,600);
            }
        });
        big.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBounds(200,0,1024,768);
            }
        });

        frame.setJMenuBar(mb);
        frame.setVisible(true);
    }
}
