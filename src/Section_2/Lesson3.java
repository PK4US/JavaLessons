package Section_2;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;

        int sum = a+b;
        System.out.println("a+b="+ sum);

        int raz = a-b;
        System.out.println("a-b="+raz);

        int proiz = a*b;
        System.out.println("a*b="+proiz);

        int del = a/b;
        System.out.println("a/b="+del);

        double del2 = (double) a/b;
        System.out.println("a/b="+del2);

        int abc = 7%3;
        System.out.println("a/b=n,"+abc);

        int a1 = 0;
        a1++;
        System.out.println("а +1:" + a1);

       int b1 = 0;
       b1--;
       System.out.println("b -1:" + b1+"\n");

       double d1 = 10;
       double d2 = 5;
       String d10 ="";
       d10+= d1+d2+"\n";
       d10+= d1-d2+"\n";
       d10+= d1*d2+"\n";
       d10+= d1/d2+"\n";
       d10+= d1++ +"\n";
       d10+= d1-- +"\n";
        System.out.println(d10);
        d1=d1+5;
        System.out.println(d1);
        int cel =8;
        cel = cel%3;
        System.out.println(cel);
    }
}
