package Section_4.Lesson4;
import javax.swing.*;

public class Lesson4 {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog(null,"Введите положительное число 1");
        String in2 = JOptionPane.showInputDialog(null,"Введите положительное число 2");
       try {
           int a = Integer.parseInt(in1);
           int b = Integer.parseInt(in2);
           if (a<=0||b<=0) throw new Exception();
           JOptionPane.showMessageDialog(null,"Сумма чиссел:" + (a+b));
       }catch (NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Вы не ввели числа");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Числа отрицательные");
       } finally {
           JOptionPane.showMessageDialog(null,"Программа завершилась!");
       }
    }
}