package Section_4.Lesson5;

public class UserException extends Exception{
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private final int code;

    public UserException (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
