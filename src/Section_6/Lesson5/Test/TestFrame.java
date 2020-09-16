package Section_6.Lesson5.Test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame  {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,200,600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        JPanel bottom = new JPanel();
        bottom.setBorder(new EmptyBorder(100,0,0,0));
        JButton buttonRed = new JButton("Red");
        buttonRed.setPreferredSize(new Dimension(200,40));
        JButton buttonWhite = new JButton("White");
        buttonWhite.setPreferredSize(new Dimension(200,40));
        JButton buttonGreen = new JButton("Green");
        buttonGreen.setPreferredSize(new Dimension(200,40));
        bottom.add(buttonRed);
        bottom.add(buttonWhite);
        bottom.add(buttonGreen);


        bottom.setBackground(Color.LIGHT_GRAY);
        buttonRed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonRed.setBackground(Color.RED);
            }
        });
        buttonWhite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonWhite.setBackground(Color.WHITE);
            }
        });
        buttonGreen.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                buttonGreen.setBackground(Color.GREEN);
            }
        });




        frame.add(bottom,BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
