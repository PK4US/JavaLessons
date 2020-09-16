package Section_6.Lesson7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(300, 200, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);

        frame.addMouseListener(new MouseListener() {
            int i=0;
            public void mouseClicked(MouseEvent me) {
                if (i<10){
                    i++;
                JButton button = new JButton("Кнопка " +i);
                panel.add(button);
                button.setBounds(me.getX()-55, me.getY()-50, 100, 40);}
                else {
                    JOptionPane.showMessageDialog(null,"Максимум 10 кнопок!");
                }
            }
            public void mousePressed(MouseEvent me) { }
            public void mouseReleased(MouseEvent me) { }
            public void mouseEntered(MouseEvent me) { }
            public void mouseExited(MouseEvent me) { }
        });
    }
}