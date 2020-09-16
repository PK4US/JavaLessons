package Section_2;

public class Lesson13 {
    public static void main(String[] args) {
//        char[][] arr = new char[2][2];
//        arr[0][0] = 'a';
//        arr[0][1] = 'b';
//        arr[1][0] = 'c';
//        arr[1][1] = 'd';
//        for (int i = 0; i<arr.length;i++){
//            for (int j = 0; j<arr[i].length; j++)
//                System.out.println("Элемент с индексом "+i+", "+j+" = "+arr[i][j]);
//        }
//        int[][] table = new int[9][9];
//        for (int i=0;i<table.length;i++){
//            for (int j = 0; j<table.length;j++)
//                table[i][j] = (i+1)*(j+1);
//        }
//        System.out.println("   1  2  3  4  5  6  7  8  9");
//        for (int i = 0;i<table.length;i++){
//            System.out.print(i+1 + " ");
//            for (int j=0;j<table.length;j++){
//                if (table[i][j]<10) System.out.print(" ");
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }


        int arr[][] = new int[2][3];
        arr[0][0] = 24;
        arr[0][1] = 20;
        arr[0][2] = 48;
        arr[1][0] = 54;
        arr[1][1] = 32;
        arr[1][2] = 12;
        int sum=0;

        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length; j++)
                 sum+=arr[i][j];
        } System.out.println("сумма всего масива = " + sum);

        int ar[]=new int[2];
        ar[0] = 0;
        ar[1] = 0;

        for (int i = 0; i<=arr.length;i++){
            ar[0]+=arr[0][i];
        }
        System.out.println(arr[0][0] + " + " + arr[0][1] + " + " + arr[0][2] + " = " + ar[0]);

        for (int i = 0; i<=arr.length;i++){
            ar[1]+=arr[1][i];
        }
        System.out.println(arr[0][0] + " + " + arr[0][1] + " + " + arr[0][2] + " = " +  ar[1]);
    }
}
