package Section_6.Lesson6;

import javax.swing.*;

public class Lesson6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        MyListener listener = new MyListener(frame);
        frame.setBounds(400,150,600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Программа");
        JMenuItem exit = new JMenuItem("Выход");
        main.add(exit);
        mb.add(main);

        JMenu bg = new JMenu("Фон");
        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem yellow = new JMenuItem("Желтый");
        bg.add(blue);
        bg.add(yellow);
        mb.add(bg);

        JMenu subMenu = new JMenu("Подменю");
        bg.add(subMenu);
        JMenuItem subMenuItem = new JMenuItem("Пункт в подменю");
        subMenu.add(subMenuItem);

        subMenu.addSeparator();

        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("ЧекБокс");
        subMenu.add(checkBoxMenuItem);

        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        subMenuItem.addActionListener(listener);
        checkBoxMenuItem.addActionListener(listener);


        frame.setJMenuBar(mb);
        frame.setVisible(true);
    }
}
