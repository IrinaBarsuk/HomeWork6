import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        //Задание 1. Не знаю как решить.


        //Задание 2
        // 4.1 Дана последовательность целых чисел а1, а2,...аn,
        //Выяснить, является ли она возрастающей последовательностью простых чисел
        Random random = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(90) + 2;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();

        boolean flag = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Последовательность является возрастающей");
        else System.out.println("Последовательность не является возрастающей");

        for (int i = 2; i < arr.length; i++) {
            flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
        }
            if (flag)
                System.out.print("последовательность состоит из простых чисел");
            else System.out.println("Последовательность состоит из простых и составных чисел");

    }
}