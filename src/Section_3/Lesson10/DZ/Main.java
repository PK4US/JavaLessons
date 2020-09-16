package Section_3.Lesson10.DZ;

public class Main {
    public static void main(String[] args) {
        User user = new User(1 ,"login","pass"){
            public void printUser(){
                System.out.println(getInfo());
            }
        };
        user.printUser();
    }
}
