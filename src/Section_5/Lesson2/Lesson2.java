package Section_5.Lesson2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(Math.E);// число Е
        System.out.println(Math.PI);// число ПИ
        System.out.println(Math.abs(-5)); //возращает всегда положительное число
        System.out.println(Math.cos(1));// косинус (в скобках радиана)
        System.out.println(Math.sin(1));// синус (в скобках радиана)
        System.out.println(Math.tan(1));// тангенс (в скобках радиана)
        System.out.println(Math.max(10,20));// сравнивает 2 числа и возращает из них максимальное
        System.out.println(Math.min(10,20)); // сравнивает 2 числа и возращает из них минимальное
        System.out.println(Math.pow(5,20)); // второе число в скобках возводит в степень (5 во 2 стемени)
        System.out.println(Math.round(5.6)); //округление
        System.out.println("рандом от 0 до 1  "+Math.random()); // генерирует случайное число от 0 до 1 (0,99999)
        System.out.println(Math.ceil(5.01)); // окргругление к ближайшему верхнему целуму
        System.out.println(Math.floor(5.99)); //окргругление к ближайшему нижнему целуму

        BigDecimal bigDecimal = new BigDecimal(5.879308);
        System.out.println(bigDecimal.setScale(3, RoundingMode.HALF_UP));

        new BigDecimal(5.879308).setScale(2,RoundingMode.HALF_UP);

        int i = (int) (0 + Math.random() * 11);
        System.out.println(i);
    }
}