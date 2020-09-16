package Section_2;

import javax.swing.*;

public class Lesson10 {
    public static void main(String[] args) {
//        int a = 5;
//        while (a>10){
//            System.out.println("Мы в цикле While");
//        }
//        do {
//            System.out.println("Мы в цикле do-While");
//        }while (a>10);
//
//        a=0;
//        while (true){
//            a++;
//            if (a==10)break;
//            if (a%2==0) continue;
//            System.out.println(a);
//        }

        String in = JOptionPane.showInputDialog(null,"Введите положительное число!");
        if (in!=null&&!in.equals("")){
            int n = Integer.parseInt(in);
            while (true){
                if (n>0)break;
                in = JOptionPane.showInputDialog(null,"Введите положительное число!");
                n = Integer.parseInt(in);
            }JOptionPane.showMessageDialog(null,"Спасибо!");
        }else { JOptionPane.showMessageDialog(null,"Ошибка!\nВы не ввели число!"); }
    }
}