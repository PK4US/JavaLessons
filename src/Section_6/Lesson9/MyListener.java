package Section_6.Lesson9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    final static public int EXIT = 0;
    final static public int PRINT = 1;

    public void actionPerformed(ActionEvent e) {
        int code = ((MyComponent)e.getSource()).getCode();
        if (code==EXIT){
            System.exit(0);
        }else if (code==PRINT){
            System.out.println("Выводим информацию в консоль!");
        }
    }
}
