package Section_2;

public class Lesson2 {
    public static void main(String[] args) {
        byte b = -128;
        short s = -32768;
        int i = -2147483648;
        long l = -1000000000;
        float f = -3.27680000f;
        double d = -3.27680000;
        boolean bool = true;
        char c = 'C';
        String str = "Hello World";

        String result = "";
        result += b +"\n";
        result += s +"\n";
        result += i +"\n";
        result += l +"\n";
        result += f +"\n";
        result += d +"\n";
        result += bool +"\n";
        result += c +"\n";
        System.out.print(result);

        String str_n = "30";
        int summ = Integer.parseInt(str_n)+ 20;
        System.out.println(summ + "\n");

        String srtr_m = "53.5";
        double dob = Double.parseDouble(srtr_m);
        System.out.println(dob);

        char name = 'E';
        System.out.println(name);

        byte age = 20;
        System.out.println(age);

    }
}
