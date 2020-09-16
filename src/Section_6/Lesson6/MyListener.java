package Section_6.Lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    JFrame frame;
    public MyListener(JFrame frame){
        this.frame = frame;
    }
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());
        String c = ae.getActionCommand();
        if (c.equals("Выход")){
            System.exit(0);
        }else if (c.equals("Желтый")){
            frame.getContentPane().setBackground(Color.YELLOW);
        }else if (c.equals("Синий")){
            frame.getContentPane().setBackground(Color.BLUE);
        }
    }
}
