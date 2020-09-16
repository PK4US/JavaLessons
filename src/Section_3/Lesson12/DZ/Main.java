package Section_3.Lesson12.DZ;

public class Main {
    public static void main(String[] args) {
        UserSocial userSocial = new UserSocial(0,"Jack","12345","Eugene",20);
        System.out.println(userSocial);

        WebMaster webMaster = new WebMaster(1,"Tesla","qwerty123","pika@gmail.com");
        System.out.println(webMaster);


        System.out.println();


        UserSocial userSocial1 =userSocial.clone();
        userSocial1.setId(99);
        userSocial1.setLogin("JEKA");
        userSocial1.setPass("123456789");
        userSocial1.setName("Steve");
        userSocial1.setAge(50);
        System.out.println(userSocial1);

        WebMaster webMaster1 = webMaster.clone();
        webMaster1.setId(100);
        webMaster1.setLogin("Bloody");
        webMaster1.setPass("123qwerty123");
        webMaster1.setAdress("King@gmail.com");
        System.out.println(webMaster1);
    }
}
