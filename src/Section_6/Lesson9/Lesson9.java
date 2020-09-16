package Section_6.Lesson9;

import javax.swing.*;

public class Lesson9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(300,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyComponent exit = new MyComponent("Выход",MyListener.EXIT);
        exit.addActionListener(new MyListener());

        MyComponent print = new MyComponent("Печать",MyListener.PRINT);
        print.addActionListener(new MyListener());

        JPanel panel = new JPanel();
        panel.add(exit);
        panel.add(print);

        frame.add(panel);
        frame.setVisible(true);
    }
}
