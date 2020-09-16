package Section_2;

import javax.swing.*;

public class Lesson8 {
    public static void main(String[] args) {
//        for (int i=0; i<=100;i++){
//
//            System.out.print(i+" ");
//        }
//
//        System.out.println();
//        for (int i=0; i<=100;i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//
//        int summa=0;
//        int n = 10;
//        for (int i=0; i<=n;i++){
//            summa+=i;
//        }
//        System.out.println("Сумма от 0 до "+n+" = "+summa);

       String sa=JOptionPane.showInputDialog(null,"Ведите положительное число:");
        if (sa!=null && !sa.equals("")){
            int ia =Integer.parseInt(sa);
            int summ=0;
            if (ia>0){
                for (int i=0;i<=ia;i++){
                    summ+=i;
                } JOptionPane.showMessageDialog(null,"Сумма от 0 до "+ia+ " = " + summ);
            }else JOptionPane.showMessageDialog(null,"Вы ввели 0");
        }else JOptionPane.showMessageDialog(null,"Ошибка!\n Вы ничего не ввели!");
    }
}
