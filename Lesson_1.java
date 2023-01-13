public class Lesson_1 {
    public static void main(String args[]) {
        //Задание 1

        int days = 234;
        int weeks = days / 7; // количество недель
        int mounths = days / 30; // количество месяцев

        System.out.println(weeks);
        System.out.println(mounths);

        //Задание 2

        int number = 57;
        int doz = 57 / 10; // число десятков
        int uni = 57 % 10; // число единиц

        System.out.printf("%d = %d*10 + %d\n", number, doz, uni);

        int sum = doz + uni;
        int multiplication = doz * uni;

        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + multiplication);

        // Задание 3

        int birth = 1991;
        int CurrYear = 2023;
        int age = CurrYear - birth;

        System.out.printf("\"Возраст = %d\" \n",age);

    }
}