package Section_3.Lesson7.DZ;

public class MyLine {           // 1) создали класс  MyLine
    public MyPoint pointStart;  //  3) Создали public поля в которых храняться объекты класса Point
    public MyPoint pointEnd;    //  3) Создали public поля в которых храняться объекты класса Point

    public MyLine(int x1, int y1, int x2, int y2) { // 4) Создали конструктор в классе MyLine, в котором 4 параметра: x и y начальной точки и x и y конечной точки.
        pointStart = new MyPoint(x1, y1);      //  5) Внутри конструктора MyLine создали на их основе два объекта Point.
        pointEnd = new MyPoint(x2, y2);        //  5) Внутри конструктора MyLine создали на их основе два объекта Point.
        System.out.println("Начальная точка (" + pointStart.x +","+ pointStart.y + ") Конечная точка ("+ pointEnd.x +","+ pointEnd.y+")"); // 7)  Вывели в консоль координаты начальной и конечной точки
    }

   public static class MyPoint{  // 2) создали внутренний класс MyPoint в классе MyLine
        public int x;            // 2) поле x в классе MyPoint
        public int y;            // 2) поле y в классе MyPoint

        public MyPoint(int x, int y) {  // конструктор класса MyPoint
            this.x = x;
            this.y = y;
        }
    }
}