package Section_6.Lesson4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(200,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel form = new JPanel();
        form.setBorder(new EmptyBorder(30,0,180,0));
        JTextField nameL = new JTextField("Name");
        nameL.setPreferredSize(new Dimension(50,30));
        JTextField emailL = new JTextField("E-mail");
        emailL.setPreferredSize(new Dimension(50,30));
        form.add(nameL);
        form.add(emailL);

        JPanel panel = new JPanel();
        JCheckBox checkBoxHTML = new JCheckBox("HTML");
        JCheckBox checkBoxJavaScript = new JCheckBox("JavaScript");
        JCheckBox checkBoxPHP = new JCheckBox("PHP");
        panel.add(checkBoxHTML);
        panel.add(checkBoxJavaScript);
        panel.add(checkBoxPHP);

        JPanel bottom = new JPanel();
        bottom.setBorder(new EmptyBorder(0,0,20,0));
        JButton button = new JButton("Подписаться");
        button.setPreferredSize(new Dimension(150,40));
        bottom.add(button);

        frame.add(form,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.CENTER);
        frame.add(bottom,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}