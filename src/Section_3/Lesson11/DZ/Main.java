package Section_3.Lesson11.DZ;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3, 4, 5,6,7};
        Shop<Integer> s1 = new Shop<Integer>(arr1);
        s1.printObject();

        System.out.println();

        String[] arr2 = { "a", "b", "c","d","e","f","g" };
        Shop<String> s2 = new Shop<>(arr2);
        s2.printObject();
    }
}
