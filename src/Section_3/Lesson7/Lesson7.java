package Section_3.Lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Firm firm = new Firm("ZIEIT","Eugene",20);
        System.out.println(firm.director.name);
        System.out.println("Директор являеться пенсионером = " + firm.director.isPensioner());
        firm.director.age = 65;
        System.out.println("Директор являеться пенсионером = " + firm.director.isPensioner());
    }
}
