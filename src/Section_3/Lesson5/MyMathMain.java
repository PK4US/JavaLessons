package Section_3.Lesson5;

public class MyMathMain {
    public static void main(String[] args) {

        new MyMath();
        System.out.println(MyMath.add);
        System.out.println(MyMath.sub);
        System.out.println(MyMath.mult);
        System.out.println(MyMath.div);

        System.out.println("   "+MyMath.getKolvizstatmet());
        new MyMath();
        System.out.println("   "+MyMath.getKolvizstatmet());
        System.out.println(MyMath.getKolvizstatmet());
    }
}
