public class Main {

    public static void main(String[] args) {
        // 1. Пример вызова метода sumDigits
        System.out.println("Сумма цифр числа 1234: " + sumDigits(1234));  // Ожидаемый результат: 10
        System.out.println("Сумма цифр числа 987: " + sumDigits(987));    // Ожидаемый результат: 24

        // 2. Пример вызова метода factorial
        System.out.println("Факториал числа 5: " + factorial(5));  // Ожидаемый результат: 120
        System.out.println("Факториал числа 7: " + factorial(7));  // Ожидаемый результат: 5040

        // 3. Пример вызова метода power (возведение в степень)
        System.out.println("2 в степени 3: " + power(2, 3));  // Ожидаемый результат: 8
        System.out.println("5 в степени 4: " + power(5, 4));  // Ожидаемый результат: 625

        // 4. Пример вызова метода fibonacci
        System.out.println("6-е число Фибоначчи: " + fibonacci(6));  // Ожидаемый результат: 8
        System.out.println("10-е число Фибоначчи: " + fibonacci(10)); // Ожидаемый результат: 55
    }

    // 1. Метод для нахождения суммы цифр числа
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  // Добавляем последнюю цифру к сумме
            number /= 10;  // Убираем последнюю цифру
        }
        return sum;
    }

    // 2. Метод для нахождения факториала числа
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;  // Умножаем результат на текущее число
        }
        return result;
    }

    // 3. Рекурсивный метод для возведения числа в степень
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;  // Любое число в степени 0 равно 1
        }
        return a * power(a, n - 1);  // Рекурсивно умножаем a на себя n раз
    }

    // 4. Метод для нахождения n-го числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Базовый случай: fibonacci(0) = 0, fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Рекурсивно находим число Фибоначчи
    }
}
