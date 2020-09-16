package Section_7.Lesson2;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        super("Man");
        setBounds(500,50,400, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 =  (Graphics2D) g;

        g2.setStroke(new BasicStroke(5));
        g2.drawOval(125,100,150,150);
        g2.drawLine(200,250,200,450);
        g2.drawLine(200,300,100,350);
        g2.drawLine(200,300,300,350);
        g2.drawLine(200,450,150,600);
        g2.drawLine(200,450,250,600);

        g2.setColor(Color.PINK);
        g2.fillOval(145,180,40,40);
        g2.fillOval(220,180,40,40);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.drawArc(187,200,30,30,180,180);

        g2.drawLine(170,150,160,165);
        g2.drawLine(170,150,180,165);
        g2.drawLine(230,150,220,165);
        g2.drawLine(230,150,240,165);

        g2.setStroke(new BasicStroke(3));
        g2.drawLine(195,175,200,185);
        g2.drawLine(205,175,200,185);

        g2.setStroke(new BasicStroke(2));
        g2.drawArc(110,160,40,40,110,150);
        g2.drawArc(115,165,30,30,110,150);
        g2.drawArc(255,160,40,40,90,-190);
        g2.drawArc(260,165,30,30,90,-190);

        for (int i = 0; i < 2000; i++) {
            g2.setColor(Color.red);
            g2.setClip(150, 185, 30, 30);
            int x = (int) Math.ceil(Math.random() * getSize().width) ;
            int y = (int) Math.ceil(Math.random() * getSize().width);
            g2.fillOval(x, y, 3, 3);
        }

        for (int i = 0; i < 2000; i++) {
            g2.setColor(Color.red);
            g2.setClip(225, 185, 30, 30);
            int x = (int) Math.ceil(Math.random() * getSize().width) ;
            int y = (int) Math.ceil(Math.random() * getSize().width);
            g2.fillOval(x, y, 3, 3);
        }
    }
}