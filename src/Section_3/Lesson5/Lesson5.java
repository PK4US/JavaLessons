package Section_3.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        new Person();
        System.out.println("Создано обьектов: " + Person.count);
        new Person();
        System.out.println("Создано обьектов: " + Person.count);
        new Person();
        System.out.println("Создано обьектов: " + Person.getCount());
    }
}
