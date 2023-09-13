import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("\nЗадача 1");
        int sum = 0;
        for (int expense : arr) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("\nЗадача 2");
        //сначала вычисляем максимальное значение элемента массива
        int maxExpense = 0;
        for (int currentExpense : arr) {
            if (currentExpense > maxExpense) {
                maxExpense = currentExpense;
            }
        }
        //затем вычисляем минимальное значение
        int minExpense = maxExpense;//инициализируем переменную - задаём уже известное максимальное значение
        for (int currentExpense : arr) {
            if (currentExpense < minExpense) {
                minExpense = currentExpense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");
        //в этой задаче можно было обойтись одним циклом for each, но тогда надо было бы использовать
        //верхний лимит выплат из условий задачи (200_000 р) для начального значеня переменной minExpense.
        //я хотел обойтись без магических чисел и поэтому сделал задачу в 2 этапа. возможно, существует и другое решене...

    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("\nЗадача 3");
        double days = 30;
        double sum = 0;
        for (int expense : arr) {
            sum += expense;
        }
        double averageAmount = sum / days;
        System.out.printf(Locale.USСредняя сумма трат за месяц составилаaverageAmount);

    }
}
