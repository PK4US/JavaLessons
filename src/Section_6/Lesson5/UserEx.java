package Section_6.Lesson5;

public class UserEx extends Exception{
    final static public int NO_NAME = 1;//создаем константу
    final static public int NO_EMAIL = 2;//создаем константу
    private int code;//код

    public UserEx(int code) {
        this.code = code;
    }//конструктор

    public int getCode() {//метод гет код
        return code;
    }
}
