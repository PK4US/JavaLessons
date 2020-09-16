package Section_6.Lesson3;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(300,300,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JLabel label = new JLabel("метка");
        panel.add(label);

        JTextField textField = new JTextField("текстовое поле");
        panel.add(textField);

        JButton button = new JButton("кнопка");
        panel.add(button);

        JCheckBox checkBox = new JCheckBox("чек бокс");
        panel.add(checkBox);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("радиокнопка1");
        JRadioButton radioButton2 = new JRadioButton("радиокнопка2");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        panel.add(radioButton1);
        panel.add(radioButton2);

        frame.add(panel);
        frame.setVisible(true);
    }
}
