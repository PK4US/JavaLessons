package Section_4.Lesson1;

import javax.swing.*;

public class Lesson1 {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null,"Введите число 1");
        String in2 = JOptionPane.showInputDialog(null,"Введите число 2");
       try {
           int a = Integer.parseInt(in1);
           int b = Integer.parseInt(in2);
           JOptionPane.showMessageDialog(null,"Сумма чиссел:" + (a+b));
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Вы не ввели число!");
           System.out.printf("Ошибка");
       }
    }
}