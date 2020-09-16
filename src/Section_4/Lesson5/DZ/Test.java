package Section_4.Lesson5.DZ;

import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args) throws NoNumberException,NullException {
        String in = JOptionPane.showInputDialog(null, "Введите число");

        try {
            if (in.trim().length() == 0) throw new NullException();
            boolean isNumeric = in.chars().allMatch(Character::isDigit);
            if (!isNumeric) throw new NoNumberException();
            JOptionPane.showMessageDialog(null, "Спасибо!");
        } catch (NullException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } catch (NoNumberException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
}