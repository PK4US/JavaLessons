package Section_2;

import javax.swing.*;

public class Lesson7 {
    public static void main(String[] args) {
//        int a = 4;
//        int b = 7;
//        if(a>b){
//            System.out.println("a>b");
//        }else{
//            System.out.println("a<b");
//        }
//        String str = a<b ?"a<b":"a>b";
//        System.out.println(str);
//        System.out.println(a<b ?"a<b":"a>b");
//
//
//        int age = 25;
//        if(age>18){
//            System.out.println("человек совершеннолетний");
//        }else
//            System.out.println("человек еще ребенок!");
//
//        String in;
//        in = JOptionPane.showInputDialog(null,"Введите число",JOptionPane.QUESTION_MESSAGE);
//        System.out.println(in);
//        if (in !=null && !in.equals("")) {
//            double n = Double.parseDouble(in);
//            if (n > 0) {
//                System.out.println("вы вели положительное число");
//            } else if (n == 0) {
//                System.out.println("вы вели ноль");
//            } else {
//                System.out.println("вы вели отрицательное число");
//            }
//        }else
//            System.out.println("Вы не ввели число");

        String in;
        String im;
        in = JOptionPane.showInputDialog(null,"Введите число A: ");
        if (in!=null && !in.equals("")) {
            double n = Double.parseDouble(in);
            if (n > 0) {
                im = JOptionPane.showInputDialog(null,"Введите чило B: ");
                if (im!=null && !im.equals("")) {
                    double m = Double.parseDouble(im);
                    if (m>0){
                        JOptionPane.showMessageDialog(null,"A/B= "+ n/m);
                    }else if (m==0){
                        JOptionPane.showMessageDialog(null,"На ноль делить нельзя!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Вы не ввели число B!");
                }
            }else if (n==0){
                im = JOptionPane.showInputDialog(null,"Введите чило B: ");
                if (im!=null && !im.equals("")) {
                    double m = Double.parseDouble(im);
                    if (m>0){
                        JOptionPane.showMessageDialog(null,"A/B= "+ n/m);
                    }
                } else JOptionPane.showMessageDialog(null,"Вы не ввели число B!");
            }
        }else JOptionPane.showMessageDialog(null,"Вы не ввели число A!");
    }
}
