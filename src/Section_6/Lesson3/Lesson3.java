package Section_6.Lesson3;

import javax.swing.*;

public class Lesson3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(300,300,800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button = new JButton("Кнопка");
        panel.add(button);

        JLabel label = new JLabel("Текст метки");
        panel.add(label);

        JCheckBox checkBox = new JCheckBox("Текст чекбокса");
        panel.add(checkBox);

        JTextField textField = new JTextField("Текст по умолчанию");
        panel.add(textField);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton radioButton1 = new JRadioButton("Радио-кнопнка 1");
        JRadioButton radioButton2 = new JRadioButton("Радио-кнопнка 2");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        panel.add(radioButton1);
        panel.add(radioButton2);

        JTextArea textArea = new JTextArea("Текст в текстовой области");
        panel.add(textArea);

        String[][] data =  {{"1","2"},{"3","4"}};
        String[] cols = {"Cтолбец 1","Столбец 2"};

        JTable table = new JTable(data,cols);
        JScrollPane scrollPane =new JScrollPane(table);
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);
    }
}