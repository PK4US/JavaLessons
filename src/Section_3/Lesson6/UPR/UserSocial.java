package Section_3.Lesson6.UPR;

public class UserSocial extends User {
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
}