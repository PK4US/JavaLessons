package Section_3.Lesson13.DZ;

import java.util.Arrays;
import java.util.Comparator;

public class Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}