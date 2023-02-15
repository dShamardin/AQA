import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {



    public static void main (String[] args) {

        String a = "I like Java!!!";
        printText(a);

        // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith()

        System.out.println(a.startsWith("I like"));

        //Найти позицию подстроки “Java” в строке “I like Java!!!”.

        System.out.println(a.indexOf("Java"));

        // Заменить все символы “а” на “о”.

        System.out.println(a.replace("a", "o"));

        // Преобразуйте строку к верхнему регистру.

                System.out.println(a.toUpperCase());

        //Преобразуйте строку к нижнему регистру.

                System.out.println(a.toLowerCase());

    }
    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    private static void printText(String text) {
        System.out.println(text);
    }
}

