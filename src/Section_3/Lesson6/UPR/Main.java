package Section_3.Lesson6.UPR;

public class Main {
    public static void main(String[] args) {
        UserSocial userSocial = new UserSocial(1,"King","123","Eugene",20);
        WebMaster webMaster = new WebMaster(2, "ProMast","qwerty","t.me/PK4US");
        System.out.println(userSocial.getInfo());
        System.out.println(webMaster.getInfo());
    }
}
