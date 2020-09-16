package Section_5.Lesson1;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        String in = JOptionPane.showInputDialog(null,"Введите строку");
        try {
            if (in.trim().length() < 5) throw new StringIndexOutOfBoundsException();
            if (in.trim().length() == 0) throw new NullPointerException();
            JOptionPane.showMessageDialog(null, in.toUpperCase());//строку от пользователя в верхнем регистре
            JOptionPane.showMessageDialog(null, in.toLowerCase()); //в нижнем регистре
            JOptionPane.showMessageDialog(null, in.substring(1, 5)); //подстроку от 2-го символа до 5-го включительно
            JOptionPane.showMessageDialog(null, in.indexOf("hello")); //результат поиска вхождения в строке строки «hello»
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ошибка! Ничего не ввели");
        }catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Ошибка! Вы ввели слишком короткую строку");
        }
    }
}