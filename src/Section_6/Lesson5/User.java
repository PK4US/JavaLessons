package Section_6.Lesson5;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private boolean news;
    private static ArrayList<User> users = new ArrayList();

    public User(String name,String email,boolean news) throws UserEx{
        if (name.length() == 0) throw new UserEx(UserEx.NO_NAME);
        if (email.length() == 0) throw new UserEx(UserEx.NO_EMAIL);
        this.name = name;
        this.email = email;
        this.news = news;
    }
    public static void add(User user){
        users.add(user);
    }
    public static void printAllUsers(){
        users.forEach((t)-> System.out.println(t));
    }
    public String toString(){
        return "Пользователь name: "+ name + "; email: " + email + "; news: " + news;
    }
}