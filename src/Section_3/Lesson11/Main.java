package Section_3.Lesson11;

public class Main {
    public static void main(String[] args) {
        Test<Integer,String> test = new Test<Integer,String>(10,"Hello");
        test.print();
        test.setData1(25);
        test.setData2("Hello World!");
        System.out.println(test.getData1());
        System.out.println(test.getData2());

        Test test1 = new Test(true,false);
        test1.print();
        test1.setData1(900);
        test1.print();
    }
}
