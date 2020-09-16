package Section_3.Lesson10;

public class Main {
    public static void main(String []args) {
        Shape shape = new Shape(10,20) {
            public void draw() {
                System.out.println("Рисуем точку с координатами (" + x + ", " + y + ")");
            }
        };
        shape.draw();

        DrawShape drawShape = new DrawShape() {

            public void draw() {
                System.out.println("Рисование фигуры");
            }
        };
        drawShape.draw();
    }
}