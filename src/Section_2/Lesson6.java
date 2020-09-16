package Section_2;

public class Lesson6 {
    public static void main(String[]args){
//        int a = 4;
//        int b = 7;
//        System.out.println(Integer.toBinaryString(a&b));// умножаем (если есть 0 то будет 0)
//        System.out.println(Integer.toBinaryString(a|b));// сложение (если будет 0 и 0 то будет 0)
//        System.out.println(Integer.toBinaryString(a^b));//или (когда одинаковые будет 0)
//        System.out.println(Integer.toBinaryString(~a)); // отрицание (
//        System.out.println(~a); //
//        System.out.println(Integer.toBinaryString(a>>1));
//        System.out.println(a>>1);
//        System.out.println(Integer.toBinaryString(a<<1));
//        System.out.println(a<<1);

        int a = 6;
        int b = 4;
        System.out.println(Integer.toBinaryString(a));//110
        System.out.println(Integer.toBinaryString(b));//100
        System.out.println("& "+Integer.toBinaryString(a&b));//110*100=100
        System.out.println("| "+Integer.toBinaryString(a|b));//110+100=110
        System.out.println("^ "+Integer.toBinaryString(a^b));//110-100=110
        System.out.println("~ "+ Integer.toBinaryString(~a));//
        System.out.println(">>1 "+ Integer.toBinaryString(a>>1));
        System.out.println("<<1 "+ Integer.toBinaryString(a<<1));
    }
}
