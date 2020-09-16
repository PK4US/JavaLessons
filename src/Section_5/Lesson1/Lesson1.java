package Section_5.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        char[] cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr);
        System.out.println(s1);
        String s2 ="My new string";
        String s3 ="My new string";
        String userData = "     T.me/pk4us   ";
        System.out.println(s2.charAt(1));//выводит символ
        System.out.println(s2.equals(s3));//сравнивает (эквивалентен или нет) ==
        System.out.println(s2.startsWith("My "));  //проверка на начало строки
        System.out.println(s2.endsWith("string")); //проверка на конец строки
        System.out.println(s2.indexOf("new"));//поиск подстроки в строке__
        System.out.println(s2.lastIndexOf("n"));//ищет последнее вхождение символа
        System.out.println(s2.length());//возращает длину строки
        System.out.println(s2.replace('n','W'));// заменяет первый символ на второй
        System.out.println(s2.substring(5));//создает новую строку из исходной начиная с N символа и до конца (обрезает)
        System.out.println(s2.substring(5,8));//создает новую строку из исходной начиная с N символа и до M символа (обрезает)
        System.out.println(s2.toLowerCase());//приводит строку к нижнему регистру (заглавные символы делает обычными)
        System.out.println(s2.toUpperCase()); //приводит строку к верхнему регистру (обычные символы делает заглавными)
        System.out.println(userData.trim()); //удаляет пробелы до и после символов
    }
}
