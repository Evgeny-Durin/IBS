import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scanx = new Scanner(System.in);
        double x = scanx.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scany = new Scanner(System.in);
        double y = scany.nextInt();
        System.out.print("Введите арифметический знак(+, -, *, /): ");
        Scanner scanZ = new Scanner(System.in);
        char z = scanZ.next().charAt(0);
        double result = 0;
        boolean i = true;
        switch (z) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Деление на ноль");
                    i = false;
                }
                break;
            default:
                System.out.println("Введен некорректный символ");
                i = false;
                break;
        }
        if (i) {
            System.out.println("Результат: " + result);
        }
    }
}