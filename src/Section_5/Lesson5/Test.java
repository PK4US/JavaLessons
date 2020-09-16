package Section_5.Lesson5;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args){
        Date d = new Date();
        Calendar calendar = Calendar.getInstance();
        String date  = JOptionPane.showInputDialog(null,"Введите дату");//просим пользователя ввести дату
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            d = format.parse(date);
            calendar.setTime(d);
            calendar.add(Calendar.YEAR, 1);
            JOptionPane.showMessageDialog(null,new SimpleDateFormat("dd.MM.yyyy").format(calendar.getTime()));
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null, "Неверные параметры");
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Вы не ввели дату");
        }
    }
}