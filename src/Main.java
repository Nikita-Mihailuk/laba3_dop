import java.util.Scanner;

public class Main {
    //метод для проверки проверки числа на простое
    public static boolean primeNumbers(int n) {
        if (n < 1) return false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("Простые числа, которые в сумме дают это число:");
            for (int i = 1; i <= number/2; i++) {
                if (primeNumbers(i) && primeNumbers(number - i)) {
                    System.out.println(i + " и " + (number - i));
                }
            }
        }
        else System.out.println("Ошибка: введённое число не является четным");
    }
}