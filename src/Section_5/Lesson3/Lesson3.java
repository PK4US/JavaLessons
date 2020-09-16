package Section_5.Lesson3;

import java.util.HashMap;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        HashMap<String,String> data = new HashMap<>();
        data.put("name","Michel");
        data.put("city","Omsk");
        data.put("age","27");
        System.out.println(data.get("name"));
        System.out.println(data.get("city"));
        System.out.println(data.get("age"));
        System.out.println("___________________________________________________________");
        System.out.println(data.containsKey("name"));//проверяет входит данный ключ в обьект
        System.out.println(data.isEmpty());//проверка на пустоту если пусто то true
        System.out.println(data.size());// возращает количество элементов
        System.out.println("___________________________________________________________");
        for (Map.Entry<String,String> d :data.entrySet()) { //перебираем циклом forEach (создали внутренний класс)
            String key = d.getKey();
            String value = d.getValue();
            System.out.println(key + " = " + value);}
        System.out.println("___________________________________________________________");
        data.forEach((t,u) -> System.out.println(t + " = " + u));//перебираем методом лямда выражение
        System.out.println("___________________________________________________________");
        data.clear();                                             //чистим все
        data.forEach((t,u) -> System.out.println(t + " = " + u));//перебираем методом лямда выражение
        System.out.println("___________________________________________________________");
        data.put("temp","value");
        data.remove("temp");// удаление элемента по ключу
        System.out.println("___________________________________________________________");
        data.put("temp","value");
        data.values().remove("value");// удаление элемента по значению
        System.out.println("___________________________________________________________");
    }
}