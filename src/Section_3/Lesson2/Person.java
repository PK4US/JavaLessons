package Section_3.Lesson2;

public class Person {
    String name;                                            //поле//свойство //характеристака
    String city;                                            //поле//свойство //характеристака
    int age;                                            //поле//свойство //характеристака

    public Person(String imya, String gorod, int let){       //создание конструктора //установливаем параметры
        this.name = imya;                                   //присваиваем значение что дает пользователь
        this.city= gorod;                                    //присваиваем значение что дает пользователь
        this.age= let;                                      //присваиваем значение что дает пользователь
    }
}
