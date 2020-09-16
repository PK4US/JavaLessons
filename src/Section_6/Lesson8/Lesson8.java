package Section_6.Lesson8;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Lesson8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(300,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { System.out.println("Нажатие клавиши,которая может быть напечатана"); }
            public void keyPressed(KeyEvent e) {
                System.out.println("Клавиша нажата");
            }
            public void keyReleased(KeyEvent e) { System.out.println("Клавиша отпущена");
                System.out.println(e.getKeyCode());
                if (e.getKeyCode()==27) System.out.println("Закрыть окно");
            }
        });

        frame.setVisible(true);
    }
}
