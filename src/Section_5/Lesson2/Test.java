package Section_5.Lesson2;

import Section_4.Lesson5.DZ.NoNumberException;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
//        String in = JOptionPane.showInputDialog(null,"Введите радиус окружности!");
//        int R = Integer.parseInt(in);
//        int R2 = (int) Math.pow(R,2);
//        int S = (int) (R2*Math.PI);
//        JOptionPane.showMessageDialog(null,"Площадь окружности" + S);

        String M = JOptionPane.showInputDialog(null,"Сумма вклада");
       try {
           if (M.trim().length() == 0) throw new NullPointerException();
           boolean isNumeric = M.chars().allMatch(Character::isDigit);
           if (!isNumeric) throw new NoNumberException();

           double moneyy = Double.parseDouble(M);
           String P = JOptionPane.showInputDialog(null,"Годовая % ставка");
           double procent = Double.parseDouble(P);
           double pribl = moneyy*procent/100;
           JOptionPane.showMessageDialog(null,"Прибыль за год " + new BigDecimal(pribl).setScale(2,RoundingMode.HALF_UP));
       } catch (NullPointerException e) {
           System.out.println("ОШИБКА! НИЧЕГО НЕ ВВЕЛИ");;
       }catch (NoNumberException e) {
           System.out.println("ОШИБКА! БУКВА");;
       }
    }
}