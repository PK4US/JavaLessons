package Section_3.Lesson2;

public class UserMain {
    public static void main(String[] args) {
        User User = new User(4,"admin","abc");
        User User2 = new User(5,"temp_admin","123");
        User[] arr_User = new User[3];
        arr_User[0] = new User(1,"Tesla","tesla");
        arr_User[1] = new User(2,"King","king");
        arr_User[2] = new User(3,"Bert","Ketty");
        for (int i=0;i<arr_User.length;i++){
            System.out.println("ID:" + arr_User[i].id + " Login:" + arr_User[i].login + " Pass:" + arr_User[i].pass);
        }
        System.out.println("ID:" + User.id + " Login:" + User.login + " Pass:" + User.pass);
        System.out.println("ID:" + User2.id + " Login:" + User2.login + " Pass:" + User2.pass);
    }
}
