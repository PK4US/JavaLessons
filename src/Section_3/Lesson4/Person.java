package Section_3.Lesson4;

public class Person {
   public String name;
   protected String city;
   private int age;
   public static int count = 0;

    public Person(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
        count++;
    }

    public Person(){ this("Default name","Default city",18); }

    public String getTextInfo(){
        return "Имя: " + this.name + "; Город: " + this.city + "; Возраст: " + this.age;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setName(){ setName("Default name"); }
    public void setCity(){
        setCity("Default city");
    }
    public void setAge(){ setAge(18); }

    public void WhoIsOld(Person person){
        if (this.age>person.age) System.out.println(this.name + " старше чем " + person.name);
        else if (this.age==person.age) System.out.println(this.name + " и " + person.name + " ровестники");
        else System.out.println(this.name + " младше чем  " + person.name);
    }

    public static int getCount(){
        return count;
    }
}
