package Section_3.Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Mike","Kiyv",25,10);
        System.out.println(programmer.getTextInfo());

        Worker worker = new Worker();
        worker.setSalery(20000);
        System.out.println(worker.getTextInfo());
        System.out.println(new Worker().getTextInfo());

        Person prog = new Programmer("Igor","Moscow",35,15);
        System.out.println(prog.getTextInfo());
    }
}
