package Section_2;

public class Lesson12 {
    public static void main(String[] args) {
//        //______________________________1МАССИВ
//        int[] arr = new int[5];
//        arr [0] = 18;                           //обьявляем
//        arr [1] = 12;                           //обьявляем
//        arr [2] = 36;                           //обьявляем
//        arr [3] = 84;                           //обьявляем
//        arr [4] = 64;                           //обьявляем
//        System.out.println(arr[3]);             //выводим на консоль массив с индексом 3
//
//        //______________________________2МАССИВ
//        double[] d_arr = new double[5];
//        for (int i = 0; i<d_arr.length;i++)     //генерируем рандомные числа в массиве
//        d_arr[i] = Math.random();               //генерируем рандомные числа в массиве
//        for (int i = 0; i<d_arr.length;i++)     //перебор всех строк
//        System.out.println(d_arr[i]);           //выводим на консоль
//
//        //______________________________3МАССИВ
//        String[] s_arr = {"Майкл","Игорь","Джек"};
//        for (int i = 0; i<s_arr.length;i++)     //перебор всех строк
//            System.out.println(s_arr[i]);       //выводим на консоль
//
//        //______________________________4МАССИВ
//        int[] ar = new int[5];
//        ar [0] = 24;
//        ar [1] = 85;
//        ar [2] = 63;
//        ar [3] = 72;
//        ar [4] = 38;
//
//        int max = ar[0];
//        for (int i = 1; i < ar.length; i++){    //перебор всех строк
//            if (ar[i] > max) {max=ar[i];}       //нахождения самого большого числа и помещение его в перемунную
//        } System.out.println("Максимальное значение в 4 массиве = " + max);
//
//        for (int a : ar){                   //перебор всех строк
//            System.out.println(a);
//        }


        //______________________________5МАССИВ_______ЗАДАНИЕ
        double[] dar = new double[5];
        double sum = 0;
        int x = 0;
        double umn = 0;
        int pr=1;
        dar[0] = 2;
        dar[1] = 4;
        dar[2] = 6;
        dar[3] = 8;
        dar[4] = 10;
//        while (true){
//            if(x<dar.length){
//                sum += dar[x];
//                x++;
//                System.out.println(sum);
//            }
//        }

        for(int e=0; x<dar.length; x++) {
            pr *= dar[e];
        }
        System.out.println(pr);
    }
}
