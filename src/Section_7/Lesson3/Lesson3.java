package Section_7.Lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson3 extends JFrame implements ActionListener {
   // KeyListener,

    private int x = 20;
    private int y = 150;
 //   final int DELTA = 10;
    private Timer timer;

    public static void main(String[] args) {
        new Lesson3();
    }

    public Lesson3(){
        super("Анимация");
        setBounds(200,200,1000, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   addKeyListener(this);
        setLayout(new FlowLayout());
        JButton button = new JButton("Старт");
        button.addActionListener((ae)->{
            if (ae.getActionCommand().equals("Старт")){
                button.setText("Стоп");
                timer.start();
            } else if (ae.getActionCommand().equals("Стоп")){
                button.setText("Старт");
                timer.stop();
            }
        });
        add(button);
        setVisible(true);
        timer = new Timer(50,this);
    }

    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 =  (Graphics2D) g;
        g2.setColor(Color.GREEN);
        if (x+50>getSize().width) x = getSize().width - 50;
        if (y+50>getSize().height) y = getSize().height - 50;
        if (x<0) x=0;
        if (y<0) y=0;
        g2.fillRect(x,y,50,50);
    }

    public void actionPerformed(ActionEvent e) {
        x+=10;
        System.out.println(x);
        repaint();
    }

//    public void keyTyped(KeyEvent ke) { }
//    public void keyPressed(KeyEvent ke) {
////        int code = ke.getKeyCode();
////        if (code==38) y-=DELTA;
////        else if (code==39) x+=DELTA;
////        else if (code==40) y+=DELTA;
////        else if (code==37) x-=DELTA;
////        repaint();
////        System.out.println(code);
//    }
//    public void keyReleased(KeyEvent ke) { }


}