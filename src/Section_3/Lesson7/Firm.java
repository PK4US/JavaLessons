package Section_3.Lesson7;

public class Firm {

    public String nameFirm;
    public Director director;

    public Firm(String nameFirm,String nameDirector,int age){
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector,age);
    }

    class Director{              //класс внутри класса, внутри внутреннего класса имеем доступ к в нешнему классу
        public String name;
        public int age;

        public Director(String name,int age){
            this.name = name;
            this.age = age;
            System.out.println("Cоздан директор в фирме " + nameFirm );
        }

        public boolean isPensioner(){
            return age >= 60;
        }
    }

}
