package Section_7.Lesson4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Lesson4 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setBounds(50,50,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Graphics2D g2 = (Graphics2D) frame.getGraphics();

        Image imageURL = ImageIO.read(new URL("https://pbs.twimg.com/media/EN8NcwRWkAMnHoP?format=jpg&name=large"));
        Image imageFile = ImageIO.read(new File("src/abc.jpg"));

        Image imageBig = imageURL.getScaledInstance(600,400, Image.SCALE_SMOOTH);
        g2.drawImage(imageBig,50,50,null);

        Image imageSmall = imageFile.getScaledInstance(210,150, Image.SCALE_SMOOTH);
        g2.drawImage(imageSmall,150,150,null);
    }
}
