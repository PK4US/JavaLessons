package Section_4.Lesson5;
import javax.swing.*;

public class Lesson5 {
    public static void main(String[] args) {
//        String in1 = JOptionPane.showInputDialog(null,"Введите положительное число 1");
//        String in2 = JOptionPane.showInputDialog(null,"Введите положительное число 2");
//       try {
//           int a = Integer.parseInt(in1);
//           int b = Integer.parseInt(in2);
//           if (a<=0||b<=0) throw new NegativeException();
//           JOptionPane.showMessageDialog(null,"Сумма чиссел:" + (a+b));
//       }catch (NumberFormatException e){
//           JOptionPane.showMessageDialog(null,"Вы не ввели числа");
//       }catch (NegativeException e){
//           JOptionPane.showMessageDialog(null,"Числа отрицательные");
//       } finally {
//           JOptionPane.showMessageDialog(null,"Программа завершилась!");
//       }


        String in = JOptionPane.showInputDialog(null,"Введите логин");
        User user = new User();
        try {
            user.setLogin(in);
            JOptionPane.showMessageDialog(null,"Вы ввошли в систему!");
        } catch (UserException ex) {
            if(ex.getCode()== UserException.SHORT_LOGIN){
                JOptionPane.showMessageDialog(null,"Вы ввели слишком короткий логин");
            }else if (ex.getCode()== UserException.LONG_LOGIN)
                JOptionPane.showMessageDialog(null,"Вы ввели слишком длинный логин");
        }

    }
}