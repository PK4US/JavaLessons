package Section_6.Lesson9.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main extends JFrame {
    JTextField f;
    JButton b;

    public static void main(String[] args) {
        Main m = new Main();
        m.initFrame();
        m.initFields();
    }

    private void initFields() {
        b=new JButton();
        this.add(b);

        f = new JTextField(10);
        f.setText("text");
        this.add(f);
        this.setVisible(true);

        f.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e) { f.setText(null); }
            public void focusLost(FocusEvent e) { f.setText("text"); }
        });
    }

    private void initFrame() {
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(3);
    }
}