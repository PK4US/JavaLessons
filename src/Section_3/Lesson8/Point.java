package Section_3.Lesson8;

public class  Point extends Shape {
    public Point(int x, int y) {
        super(x, y);
    }
    public void draw() {
        System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
    }

    @Override
    public void hello() {

    }
}
