package Section_3.Lesson10.DZ;

public abstract class User implements PrintData{
   private int id;
   private String login;
   private String pass;

    public User(int id, String login, String pass){
        this.id = id;
        this.login = login;
        this.pass = pass;
    }


    public int getIdd(){return this.id;}
    public String getLogin(){return this.login;}
    public String getPass(){return this.pass;}

    public void setId(int id){this.id=id;}
    public void setLogin(String login){this.login=login;}
    public void setPass(String pass){this.pass=pass;}

    public void setId(){this.id=0;}
    public void setLogin(){this.login="guest";}
    public void setPass(){this.pass="””";}

    public String getInfo(){return "ID:" + this.id + " Login:" + this.login + " Pass:" + this.pass;}

    @Override
    public void printUser() {

    }
}