package Section_3.Lesson12.DZ;

import Section_3.Lesson8.DZ.User;

public class UserSocial extends User implements Cloneable {
    private String name="Имя";
    private int age=18;

    public UserSocial(int id, String login, String pass,String name, int age) {
        super(id, login, pass);
        this.name=name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name; }
    public int getAge() {return age; }

    public String getInfo(){
        String getText = super.getInfo();
        getText+=" Имя: "+ name + " Возраст: "+ age;
        return getText;
    }

    public String toString(){ return getInfo(); }
    public UserSocial clone (){
        return new UserSocial(getIdd(),getLogin(),getPass(),getName(),getAge());
    }
    public void printUser() {
        System.out.println(getInfo());
    }
}