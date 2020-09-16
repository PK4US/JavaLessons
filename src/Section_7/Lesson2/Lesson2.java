package Section_7.Lesson2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Lesson2 extends JFrame {
    public static void main(String[] args) {
        new Lesson2();
    }

    public Lesson2(){
        super("Графика");
        setBounds(300,200,600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 =  (Graphics2D) g;
        g2.drawRect(100,100,200,200);//квадрат
        g2.drawLine(100,100,200,200);//линия

        Color oldColor = g2.getColor();
        System.out.println(oldColor);

        Color newColor = new Color(255,0,0);
        g2.setColor(newColor);
        g2.drawRect(110,110,180,180);//квадрат
        g2.drawLine(200,200,300,100);//линия
        g2.setColor(oldColor);
        g2.fillRect(111,111,179,179);
        g2.setColor(newColor);
        g2.drawRoundRect(120,120,160,160,500,50);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(130,130,140,140);
        Color greenColor = new Color(0,255,0);
        g2.setColor(greenColor);
        g2.fillOval(133,133,134,134);
        g2.setColor(oldColor);
        g2.drawArc(400,300,100,100,90,90);

        g2.setColor(greenColor);
        Font font = new Font("Tahoma",Font.BOLD|Font.ITALIC,40);
        g2.setFont(font);
        g2.drawString("Hello World",320,70);
        g2.setPaint(new GradientPaint(350,100,Color.BLUE,550,100,Color.RED,true));
        g2.fill(new Ellipse2D.Double(350,100,200,200));

        for (int i = 1; i<100;i++){
            Color randColor = new Color(
                    (int) Math.ceil(Math.random()*255),
                    (int) Math.ceil(Math.random()*255),
                    (int) Math.ceil(Math.random()*255)
            );
            g2.setColor(randColor);
            int x = (int) Math.ceil(Math.random()*getSize().width);
            int y = (int) Math.ceil(Math.random()*getSize().height-50)+50;
            g2.fillOval(x,y,20,20);
        }
    }
}