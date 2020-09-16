package Section_8.Lesson1;

import javax.swing.*;

public class Test2 extends Test{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,100,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        String[][] data =  {{"1","2"},{"3","4"}};
        String[] cols = {"Имя файла","Размер"};

        JTable table = new JTable(data,cols);
        JScrollPane scrollPane =new JScrollPane(table);
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);
    }
}