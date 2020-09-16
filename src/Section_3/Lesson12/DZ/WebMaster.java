package Section_3.Lesson12.DZ;
import Section_3.Lesson8.DZ.User;
public class WebMaster extends User implements Cloneable {

    String adress = "google.com";

    public WebMaster(int id, String login, String pass,String adress) {
        super(id, login, pass);
        this.adress = adress;
    }

    public void setAdress(String adress) {this.adress = adress; }
    public String getAdress() {return adress; }

    public String getInfo(){
        String getText = super.getInfo();
        getText+=" Адресс:" + adress;
        return getText;
    }

    public String toString(){
        return getInfo();
    }
    public WebMaster clone (){
        return new WebMaster(getIdd(),getLogin(),getPass(),getAdress());
    }
    public void printUser() {
        System.out.println(getInfo());
    }
}
