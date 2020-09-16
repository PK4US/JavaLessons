package Section_7.Lesson4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Art");
        frame.setBounds(330,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            Graphics2D g2 = (Graphics2D) frame.getGraphics();
            String URL =JOptionPane.showInputDialog(null,"Ведите URL картинки");
            if (!URL.startsWith("https://")) throw new MalformedURLException();
            if (!URL.contains("jpg")) throw new NullPointerException();
            Image imageURL = ImageIO.read(new URL(URL));
            Image imageBig = imageURL.getScaledInstance(600,400, Image.SCALE_SMOOTH);
            g2.drawImage(imageBig,50,70,null);
        } catch (MalformedURLException e) {
            JOptionPane.showMessageDialog(null,"Ссылки не существует");
            System.exit(0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(null,"Вы ничего не ввели");
            System.exit(0);
        }
    }
}
