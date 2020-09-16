//Используя рекурсию, выведите все числа от 1 до 100.
//Используя рекурсию, найдите сумму цифр произвольного целого числа (для примера, можете взять 1539).
package Section_3.Lesson14;

public class Test {
    public static void main(String[] args) {
        someMethods(1);
        proiz(0);
        fac(5);
    }

    private static int fac(int x){
        if (x==1)
            return 1;
        System.out.println(fac(x));
        return fac(x-1)*x;
    }

    static void someMethods(int n){
        if (n>100)
            return;
        System.out.println(n);
        someMethods(n+1);
    }

    static void proiz(int m){
        if (m>1539)
            return;
        System.out.println(m);
        proiz(m+1);
    }
}