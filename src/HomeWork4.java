import java.util.Arrays;

public class HomeWork4 {
    public static int a[][];

    public static void main(String[] args) {
        //Задание 1. Найти количество элементов массива, встречающихся
        // в массиве два раза.
        int[] arr = new int[]{1, 2, 1, 4, 5, 4, 2, 9, 0};
        int[] arr1 = new int[9];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count==1)
                System.out.println(arr[i]+ " ");;
                count=0;
        }

        //Задание 2. Вывести в консоль фигуру, образованную числами
        //pattern 22
        int nRows = 5;
        int nCols = 5;
        int count1=1;
        a = new int[nRows][nCols];
        for (int i = 0; i < nRows; i++)
            for (int j = 0; j < nCols; j++)
                a[i][j] = 0;
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (i == j) {
                    System.out.print(count1);
                    count1++;
                } else
                    System.out.print("0");
            }
            System.out.println();
        }
        System.out.println(arrToString());
    }
    public static String arrToString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j] != 0){
                    String s = Integer.toString(a[i][j]);
                    String padded = String.format("%2s", s);
                    result.append(padded);
                }
                else result.append(" ");
            result.append("\n");
        }
        return result.toString();
    }




}