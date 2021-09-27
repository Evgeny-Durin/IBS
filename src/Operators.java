import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        System.out.print("Введите второе число: ");
        double y = scan.nextInt();
        System.out.print("Введите третье число: ");
        double z = scan.nextInt();
        double s = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел: " + s);
        if (Math.floor(s / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}