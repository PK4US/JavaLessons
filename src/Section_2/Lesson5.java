package Section_2;

public class Lesson5 {
    public static void main(String[] args) {
//        boolean b1 = true;
//        boolean b2 = false;
//        System.out.println(b1+"+"+b2+"="+(b1&&b2)); // && если есть хоть одно false будет false
//        System.out.println(b1+"+"+b2+"="+(b1||b2)); // || если будет хоть одно true будет true
//        System.out.println(b1+"+"+b2+"="+(b1^b2)); // ^ если будет различны будет true если одинаковые будет false
//        System.out.println("!"+b1+"="+(!b1)); // !- меняет наоборот
//        System.out.println("!"+b2+"="+(!b2));// !- меняет наоборот

        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println((a&&a));
        System.out.println(b||c);
        System.out.println(a^b);
    }
}
