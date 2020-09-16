package Section_5.Lesson3;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap <String, Integer> user = new HashMap<>();
        user.put("Alex", 20);
        user.put("John", 30);
        user.put("Sam", 50);

        Integer age = user.get("John") + 4;
        user.put("John", age);
        user.forEach((q,w) -> System.out.println(q + " = " + w));
    }
}