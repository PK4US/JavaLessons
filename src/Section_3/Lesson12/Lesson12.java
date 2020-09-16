package Section_3.Lesson12;

public class Lesson12 {
    public static void main(String[] args) {
        Point point = new Point(10,20);
        System.out.println(point);
        String s = "Наш обьект: "+ point;
        System.out.println(s);

        Point point1 = point;
        System.out.println(point1);
        point.x = 30;
        System.out.println(point1);

        point1 = point.clone();
        point.x = 50;
        point.y = 40;
        System.out.println(point);
        System.out.println(point1);
    }
}