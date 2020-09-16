package Section_7.Lesson3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame implements ActionListener {
    private Timer timer;
    private int x = 0;
    private int y = 0;


    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        super("Man");
        setBounds(500,50,400, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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
        timer = new Timer(250,this);
    }

    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2 =  (Graphics2D) g;

        if (x+50>getSize().width) x = getSize().width - 50;
        if (y+50>getSize().height) y = getSize().height - 50;
        if (x<0) x=0;
        if (y<0) y=0;

        g2.setStroke(new BasicStroke(5));
        g2.drawOval(125+x,y+100,150,150);
        g2.drawLine(200+x,y+250,200+x,y+450);
        g2.drawLine(200+x,y+300,100+x,y+350);
        g2.drawLine(200+x,y+300,300+x,y+350);
        g2.drawLine(200+x,y+450,150+x,y+600);
        g2.drawLine(200+x,y+450,250+x,y+600);

        g2.setColor(Color.PINK);
        g2.fillOval(145+x,y+180,40,40);
        g2.fillOval(220+x,y+180,40,40);

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.drawArc(187+x,y+200,30,30,180,180);

        g2.drawLine(170+x,y+150,160+x,y+165);
        g2.drawLine(170+x,y+150,180+x,y+165);
        g2.drawLine(230+x,y+150,220+x,y+165);
        g2.drawLine(230+x,y+150,240+x,y+165);

        g2.setStroke(new BasicStroke(3));
        g2.drawLine(195+x,y+175,200+x,y+185);
        g2.drawLine(205+x,y+175,200+x,y+185);

        g2.setStroke(new BasicStroke(2));
        g2.drawArc(110+x,y+160,40,40,110,150);
        g2.drawArc(115+x,y+165,30,30,110,150);
        g2.drawArc(255+x,y+160,40,40,90,-190);
        g2.drawArc(260+x,y+165,30,30,90,-190);

        for (int i = 0; i < 2000; i++) {
            g2.setColor(Color.red);
            g2.setClip(x+150, y+185, 30, 30);
            int x = (int) Math.ceil(Math.random() * getSize().width) ;
            int y = (int) Math.ceil(Math.random() * getSize().width);
            g2.fillOval(x, y, 3, 3);
        }

        for (int i = 0; i < 2000; i++) {
            g2.setColor(Color.red);
            g2.setClip(x+225, y+185, 30, 30);
            int x = (int) Math.ceil(Math.random() * getSize().width) ;
            int y = (int) Math.ceil(Math.random() * getSize().width);
            g2.fillOval(x, y, 3, 3);
        }
    }


    public void actionPerformed(ActionEvent e) {
        x+=10;

        repaint();
    }
}