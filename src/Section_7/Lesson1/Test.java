package Section_7.Lesson1;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {
    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        super("Графика");
        setBounds(300,200,600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    String inX = JOptionPane.showInputDialog(null,"Введите координаты X");
    String inY = JOptionPane.showInputDialog(null,"Введите координаты Y");
    String inWIDTH = JOptionPane.showInputDialog(null,"Введите ширину прямоугольника");
    String inHEIGHT = JOptionPane.showInputDialog(null,"Введите высоту прямоугольника");

    int X = Integer.parseInt(inX);
    int Y = Integer.parseInt(inY);
    int WIDTH = Integer.parseInt(inWIDTH);
    int HEIGHT = Integer.parseInt(inHEIGHT);

    public void paint (Graphics g){
        try {
            if (X<0||Y<0||WIDTH<=0||HEIGHT<=0)throw new Exception();
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(X,Y,WIDTH,HEIGHT);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Вы не ввели данные");
        }catch (Exception er){
            JOptionPane.showMessageDialog(null,"Вы ввели данные меньше нуля");
        }
    }
}