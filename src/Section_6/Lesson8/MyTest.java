package Section_6.Lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class MyTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,300,300);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();


        JButton button = new JButton("Кнопка");
        int x = 100, y = 100;
        button.setBounds(x,y,100,40);
        frame.add(button);

        button.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) { }
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 39) {
                    System.out.println("вправо");
                    //button.setLocation(x=+10,y);
                }
                if (e.getKeyCode() == 37) {
                    System.out.println("влево");
                    //button.setLocation(x -= 10, y);
                }
                if (e.getKeyCode() == 38) {
                    System.out.println("вверх");
                    //button.setLocation(x, y -= 10);
                }
                if (e.getKeyCode() == 40) {
                    System.out.println("вниз");
                    //button.setLocation(x, y += 10);
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}

