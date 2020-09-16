package Section_3.Lesson8.DZ;

public class Main {
    public static void main(String[] args) {
        UserSocial userSocial = new UserSocial(1,"King","123","Eugene",20);
        WebMaster webMaster = new WebMaster(2, "ProMast","qwerty","t.me/PK4US");
        System.out.println(userSocial.getInfo());
        System.out.println(webMaster.getInfo());
        UserSocial userSocial1 = new UserSocial(3,"asdfgh","456","SocUS",35);
        userSocial1.printUser();
        WebMaster webMaster1 = new WebMaster(4,"qwerty","789","qwerty@gmail.com");
        webMaster1.printUser();
    }
}
