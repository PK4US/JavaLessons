package Section_2;

import javax.swing.*;

public class Lesson9 {
    public static void main(String[] args) {
//        int i =0;
//        while (i<20){
//            System.out.print(i+" ");
//            i++;
//        }
//
//        String in = JOptionPane.showInputDialog(null,"Ведите положительное число");
//        if (in !=null && !in.equals("")){
//            int im = Integer.parseInt(in);
//            if (im<0){
//                JOptionPane.showMessageDialog(null,"Ошибка!\nВы ввели отрицательное число!");
//            } else {
//                int suma=0;
//                i =1;
//                while (i<=im){
//                    suma+=i;
//                    i++;
//                }
//                JOptionPane.showMessageDialog(null,"Сумма от 0 до " + im + " = " + suma);
//            }
//        }else {
//            JOptionPane.showMessageDialog(null,"Ошибка!\nВы не ввели число!");
//        }


        String in = JOptionPane.showInputDialog(null,"Введите неотрицательно целое число! ");
        if(in!=null && !in.equals("")){
            int im=Integer.parseInt(in);
            if (im<=0){
                JOptionPane.showMessageDialog(null,"Ошибка!\nВы ввели 0 или отрицательное число!");
                JOptionPane.showMessageDialog(null,"Дибил");
            }else {
                int fac=1;
                int i =1;
                while (i<=im){
                    fac=fac*i;
                    i++;
                } JOptionPane.showMessageDialog(null,"Факториал числа " + im + " = " + fac);
            }
        }else JOptionPane.showMessageDialog(null,"Ошибка!\nВы не ввели число!");
    }
}
