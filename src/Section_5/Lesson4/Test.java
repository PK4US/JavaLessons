package Section_5.Lesson4;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> user = new ArrayList<>();
        user.add("Anna");
        user.add("Helen");
        user.add("Vika");
        for (int i = 0; i < user.size();i++) {System.out.print(user.get(i) + " ");} System.out.println();
        user.set(1,"Jeka");
        user.forEach((t) -> System.out.print(t + " ")); System.out.println();
    }
}