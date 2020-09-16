package Section_4.Lesson3;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        String i = JOptionPane.showInputDialog(null,"Введите число!");
       try {
           int a = Integer.parseInt(i);
           if (a<=0) throw new Exception();
           JOptionPane.showMessageDialog(null,"Спасибо!");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Некорректный ввод");
       }
    }
}
