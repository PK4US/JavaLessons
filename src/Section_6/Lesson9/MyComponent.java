package Section_6.Lesson9;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JButton {

    private int code;

    public MyComponent (String title, int code){
        super(title);
        this.code = code;
        setFont(new Font("Ariel",Font.BOLD,40));
    }

    public int getCode() {
        return code;
    }
}
