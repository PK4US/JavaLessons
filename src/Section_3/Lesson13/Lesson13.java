package Section_3.Lesson13;

import java.util.Arrays;
import java.util.List;

public class Lesson13 {
    public static void main(String[] args) {
        String arr[] = {"Hello World!","Hello","!","Very long string!"};
        Arrays.sort(arr,new MyCompare());
        for (String s : arr) System.out.println(s);

        System.out.println();

        Arrays.sort(arr,(s1,s2) ->Integer.compare(s2.length(),s1.length()));
        for (String s : arr) System.out.println(s);

        System.out.println();

        List<String> arrNew = Arrays.asList("A","AB","ABC");
        arrNew.forEach((t)-> System.out.println(t));
    }
}