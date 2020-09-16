package Section_8.Lesson1;

import javax.swing.*;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(400,100,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        String in = JOptionPane.showInputDialog(null,"Укажите путь к папке");
        File file = new File(in);
        File[]files = file.listFiles();
        for (File f:files) {
            JOptionPane.showMessageDialog(null, "Размер файла - " + f.length());

        }

        String[][] data =  {{"1","2"},{"3","4"}};
        String[] cols = {"Имя файла","Размер"};

        JTable table = new JTable(data,cols);
        JScrollPane scrollPane =new JScrollPane(table);
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);
    }
}