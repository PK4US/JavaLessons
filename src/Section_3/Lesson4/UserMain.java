package Section_3.Lesson4;

public class UserMain {
    public static void main(String[] args) {
        User User = new User(4,"admin","abc");
        User User2 = new User(5,"temp_admin","123");
        Section_3.Lesson4.User[] arr_User = new User[3];
        arr_User[0] = new User(1,"Tesla","tesla");
        arr_User[1] = new User(2,"King","king");
        arr_User[2] = new User(3,"Bert","Ketty");
        for (int i=0;i<arr_User.length;i++){
            System.out.println("ID:" + arr_User[i].getIdd() + " Login:" + arr_User[i].getLogin() + " Pass:" + arr_User[i].getPass());
        }
        System.out.println("ID:" + User.getIdd() + " Login:" + User.getLogin() + " Pass:" + User.getPass());
        System.out.println("ID:" + User2.getIdd() + " Login:" + User2.getLogin() + " Pass:" + User2.getPass());

        User user = new User(6,"Alina","Guk");
        System.out.println(user.getInfo());
        User.setId(7);
        User.setLogin("Eugene");
        User.setPass("qwerty123");
        System.out.println(User.getInfo());

        user.setId();
        user.setLogin();
        user.setPass();
        System.out.println(user.getInfo());
    }
}
