public class Main {

    public static void main(String[] args) {
        // 1. Пример вызова метода sum
        System.out.println("Сумма 3 и 5: " + sum(3, 5));
        System.out.println("Сумма -2 и 8: " + sum(-2, 8));

        // 2. Пример вызова метода printGreeting
        printGreeting("Алиса");
        printGreeting("Боб");

        // 3. Пример вызова метода findMax
        int[] numbers1 = {1, 3, 7, 0, 5};
        int[] numbers2 = {12, 5, 8, 20, 15};
        System.out.println("Максимальное значение в массиве numbers1: " + findMax(numbers1));
        System.out.println("Максимальное значение в массиве numbers2: " + findMax(numbers2));

        // 4. Пример вызова метода isEven
        System.out.println("Число 4 четное? " + isEven(4));
        System.out.println("Число 7 четное? " + isEven(7));

        // 5. Пример вызова метода calculateAverage
        System.out.println("Среднее значение чисел 4.5, 6.0 и 7.5: " + calculateAverage(4.5, 6.0, 7.5));
        System.out.println("Среднее значение чисел 1.0, 3.0 и 5.0: " + calculateAverage(1.0, 3.0, 5.0));

        // 6. Пример вызова перегруженных методов multiply
        System.out.println("Произведение 3 и 4: " + multiply(3, 4));
        System.out.println("Произведение 2, 3 и 4: " + multiply(2, 3, 4));
    }

    // 1. Метод для нахождения суммы двух целых чисел
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2. Метод для вывода приветствия
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Метод для нахождения максимального элемента в массиве
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 4. Метод для проверки четности числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 5. Метод для расчета среднего арифметического трех чисел
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // 6. Перегруженный метод для умножения двух чисел
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Перегруженный метод для умножения трех чисел
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
