package Section_3.Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        Person person = new Person("Igor", "Omsk",18);
        System.out.println(person.getTextInfo());

        person.setName("Oleg");
        person.setCity("Kiyv");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getCity());
        System.out.println(person.getAge());

        Person person1 = new Person("Alex","Moscow", 25);
        person.WhoIsOld(person1);
        person1.setAge(30);
        person.WhoIsOld(person1);
        person1.setAge(15);
        person.WhoIsOld(person1);

        Person person2 = new Person();
        System.out.println(person2.getTextInfo());

        person.setName();
        person.setCity();
        person.setAge();
        System.out.println(person.getTextInfo());
    }
}
