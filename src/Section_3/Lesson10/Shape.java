package Section_3.Lesson10;

abstract public class Shape implements DrawShape{
    public int x;
    public int y;
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}