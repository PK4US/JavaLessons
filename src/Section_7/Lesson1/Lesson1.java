package Section_7.Lesson1;

import javax.swing.*;
import java.awt.*;

public class Lesson1 extends JFrame {
    public static void main(String[] args) {
        new Lesson1();
    }

    public Lesson1(){
        super("Графика");
        setBounds(300,200,600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 =  (Graphics2D) g;
        g2.drawRect(100,100,200,200);
    }
}