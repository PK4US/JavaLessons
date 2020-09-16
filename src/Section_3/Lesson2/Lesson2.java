package Section_3.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        Person p = new Person("Jack","Moscow",30);                  //создаем обьект
        System.out.println(p.name);                                                   //выводим в консоль
        System.out.println(p.city);                                                   //выводим в консоль
        System.out.println(p.age);                                                   //выводим в консоль
        System.out.println();                                                           //выводим в консоль
        Person[] p_arr = new Person[3];                                                   //создаем массив
        p_arr[0] = new Person("Igor","Dnepr",25);                     //создаем массив
        p_arr[1] = new Person("Danil","Kiyv",20);                     //создаем массив
        p_arr[2] = new Person("Sergey","Lviv",45);                     //создаем массив
        for (int i = 0; i<p_arr.length;i++){                                            //перебор всех значений в массиве
            System.out.println(p_arr[i].name+" "+ p_arr[i].city+" "+p_arr[i].age);      //вывод в консоль
        }
    }
}
