import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scanX = new Scanner(System.in);
        double x = scanX.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scanY = new Scanner(System.in);
        double y = scanY.nextInt();
        System.out.print("Введите арифметический знак(+, -, *, /): ");
        Scanner scanZ = new Scanner(System.in);
        char z = scanZ.next().charAt(0);
        double result = 0;
        switch (z) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> System.out.println("Введен некорректный символ");
        }
        if (result != 0) {
            System.out.println("Результат: " + result);
        }
    }
}