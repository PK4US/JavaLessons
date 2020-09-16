package Section_3.Lesson8.DZ;

public class WebMaster extends User {

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

    public void printUser() {
        System.out.println(getInfo());
    }
}
