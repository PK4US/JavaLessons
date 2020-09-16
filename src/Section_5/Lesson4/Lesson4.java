package Section_5.Lesson4;

import java.util.ArrayList;
import java.util.Comparator;

public class Lesson4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i<10; i++){ int n = (int) (Math.random()*11); arr.add(n);}//добавить
        System.out.println(arr.get(3));
        for (int i = 0; i < arr.size();i++) {System.out.print(arr.get(i) + " ");}
        System.out.println();
        System.out.println(arr.contains(5));//возращает true если такой элемент есть (проверка есть ли элемент)
        System.out.println(arr.indexOf(5));// возращает индекс элемента который входит число(если нет возращает -1)
        System.out.println(arr.size());//возращает размер массива (колличество элементов)
        System.out.println(arr.remove(3));// удаляет элемент с соответствующим индексом
        arr.forEach((t) -> System.out.print(t + " "));//лямда выражение - перебор всех чисел
        System.out.println();
        System.out.println(arr.remove(new Integer(5)));// удаляет элемент по его значению
        arr.forEach((t) -> System.out.print(t + " "));//лямда выражение - перебор всех чисел
        System.out.println();
        arr.set(1,5);//изменяем элемент (с индексем 1 на элемент 5)
        arr.forEach((t) -> System.out.print(t + " "));//лямда выражение - перебор всех чисел
        arr.sort(new Comparator<Integer>() {public int compare(Integer t, Integer t1) { return t - t1; }});//перебор всех элементы от малого к большому
        System.out.println();
        arr.forEach((t) -> System.out.print(t + " "));//лямда выражение - перебор всех чисел
    }
}