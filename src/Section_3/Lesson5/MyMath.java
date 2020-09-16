package Section_3.Lesson5;

public class MyMath {
    public static int add;
    public static int sub;
    public static int mult;
    public static int div;
    public static int a = 100;
    private static int kolvizstatmet;

    public MyMath(){
        add++;
        sub=a-add;
        mult=a*sub;
        div=a/add;

        kolvizstatmet++;
    }

    public static int getAdd(){return add;}
    public static int getSub(){return sub;}
    public static int getMult(){return mult;}
    public static int getDiv(){return div;}

    public static int getKolvizstatmet(){return kolvizstatmet;}
}
