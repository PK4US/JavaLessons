package Section_4.Lesson1;

public class Test {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5};
        try {
            System.out.println(i[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка");
        }
    }
}
