import java.util.Scanner;
import java.util.Random;

public class Lesson_2 {

    // Задаение 4. Подсмотрел решение
    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] scanArray(int n) {

        int[] array = new int[n];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int[] generateArray(int n) {

        int[] array = new int[n];
        Random r = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100); // 0 - 100
        }

        return array;
    }

    public static void main(String[] args) {

        int[] array = generateArray(10);

        printArray(array);

        // Задание 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double var1 = sc.nextDouble();
        System.out.println("Введите второе число");
        double var2 = sc.nextDouble();
        sc.close();

        if(Math.abs(var1) > Math.abs(var2)) {
            var1 = var1/2;
            System.out.println(var1);
        }
        if (Math.abs(var1) == Math.abs(var2)) {
        }
        if (Math.abs(var1) < Math.abs(var2)) {
            System.out.println("var 1 < var 2");
        }


        //Задание 2
        for (int i = 10; i <= 25; i++) {
            System.out.printf("%d %d.4\n", i,i);
        }


        //Задание 3
        for(int i = 5000; i > 0; i--) {
            if(i % 39 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}