import java.util.Random;

/**
 * SkyPro. My code dz#5
 *
 * @author RAIL
 * @version dated Apr 18, 2022
 */


public class ExampleFive {

    public static void main(String[] args) {
        // Не удалось заталкать создание массива в другой метод, когда более подробно разберусь с методами, исправлю
        Random random = new Random();
        int[] arr = new int[30];
        System.out.println();
        System.out.println("Создаем массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // Задание 1
        System.out.println("Задание 1");
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + Sum + " рублей");

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
        int minSum = 1000000000;
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        // Задание 3
        System.out.println();
        System.out.println("Задание 3");
        float Avarage = 0f;
        float Sum2 = 0f;
        for (int i = 0; i < arr.length; i++) {
            Sum2 += arr[i];
            Avarage = Sum2 / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + Avarage + " рублей");

        // Задание 4
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int r = reverseFullName.length;
        for (int i = r-1;  i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}