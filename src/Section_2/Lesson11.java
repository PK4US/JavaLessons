package Section_2;

import javax.swing.*;

public class Lesson11 {
    public static void main(String[] args) {
//        int a = 1;
//        String s;
//        while (true){
//            switch (a){
//                case 1:
//                    s="Один";
//                    break;
//                case 2:
//                    s="Два";
//                    break;
//                case 3:
//                    s="Три";
//                    break;
//                default:
//                    s="Другое число";
//            }System.out.println(a + " - " + s);
//            a++;
//            if (a>4)break;
//        }

        String in1 = JOptionPane.showInputDialog(null,"Введите первое число!");
        String in2 = JOptionPane.showInputDialog(null,"Введите второе число!");
        String in3 = JOptionPane.showInputDialog(null,"Введите одну из операций: «+», «-», «*», «/»");
        if (in1!=null && !in1.equals("")){
            if (in2!=null && !in2.equals("")){
                if (in3!=null && !in3.equals("")){
                    int im1 = Integer.parseInt(in1);
                    int im2 = Integer.parseInt(in2);
                    int s = 0;
                    switch (in3){
                        case "+":
                            s = im1 + im2;
                            break;

                        case "-":
                            s = im1-im2;
                            break;

                        case "*":
                            s = im1*im2;
                            break;

                        case "/":
                            if (im2>0){
                            s = im1/im2;
                            break;
                            }else JOptionPane.showMessageDialog(null,"Деление на ноль невозможно");

                    }JOptionPane.showMessageDialog(null,im1+in3+im2+"="+s);
                }else JOptionPane.showMessageDialog(null,"Вы не ввели не одну из операций!");
            }else JOptionPane.showMessageDialog(null,"Вы не ввели второе число число!");
        }else JOptionPane.showMessageDialog(null,"Вы не ввели первое число!");


    }
}