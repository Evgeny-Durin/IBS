import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double y = scan.nextDouble();
        System.out.print("Введите арифметический знак(+, -, *, /): ");
        char z = scan.next().charAt(0);
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