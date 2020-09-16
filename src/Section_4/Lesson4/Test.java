package Section_4.Lesson4;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        int i[] = {1111,2222,3333,4444,5555};
        String s = JOptionPane.showInputDialog(null,"Введите число от 0 до 4");
        try {
            int p = Integer.parseInt(s);
            if (p<0) throw new Exception();
            if (p>5) throw new RuntimeException();
            JOptionPane.showMessageDialog(null,i[p]);
        }catch (NumberFormatException er){
            JOptionPane.showMessageDialog(null,"Вы не ввели число");
        }catch (RuntimeException ex){
            JOptionPane.showMessageDialog(null,"Вы нажали число больше 5");
        } catch (Exception et){
            JOptionPane.showMessageDialog(null,"Числа отрицательные");
        }
    }
}