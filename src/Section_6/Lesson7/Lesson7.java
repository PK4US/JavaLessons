package Section_6.Lesson7;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Lesson7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(300,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                System.out.println("Клик мыши");
                System.out.println(me.getX() + " - " + me.getY());
                if (me.getButton()== MouseEvent.BUTTON1){
                    System.out.println("Клик левой кнопки мыши!");
                }else if (me.getButton()== MouseEvent.BUTTON3){
                    System.out.println("Клик правой кнопки мыши!");
                }
            }

            public void mousePressed(MouseEvent e) {
                //System.out.println("Кнопка мыши нажата");
            }
            public void mouseReleased(MouseEvent e) {
                //System.out.println("Курсор мыши отпущена");
            }
            public void mouseEntered(MouseEvent e) {
                //System.out.println("Курсор над контейнером");
            }
            public void mouseExited(MouseEvent e) {
               // System.out.println("Курсор мыши ушел с контейнера");
            }
        });

        frame.setVisible(true);
        
    }
}
