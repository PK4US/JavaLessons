package Section_6.Lesson8;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimpleFrame extends JFrame {
    private JPanel panel;
    private JButton jButton;
    private int x = 200, y = 5;

    public SimpleFrame() {
        setSize(500, 500);
        panel = new JPanel();
        jButton = new JButton("КНОПКА");
        jButton.setLocation(x, y);
        panel.add(jButton);
        add(panel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        jButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int Key = e.getKeyCode();
                if (Key == KeyEvent.VK_RIGHT) {
                    jButton.setLocation(x += 10, y);
                }
                if (Key == KeyEvent.VK_LEFT) {
                    jButton.setLocation(x -= 10, y);
                }
                if (Key == KeyEvent.VK_UP) {
                    jButton.setLocation(x, y -= 10);
                }
                if (Key == KeyEvent.VK_DOWN) {
                    jButton.setLocation(x, y += 10);
                }

            }
        });
    }

    public static void main(String[] args) {
        SimpleFrame simpleFrame = new SimpleFrame();
    }
}