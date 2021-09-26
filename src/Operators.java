import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scanx = new Scanner(System.in);
        double x = scanx.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scany = new Scanner(System.in);
        double y = scany.nextInt();
        System.out.print("Введите третье число: ");
        Scanner scanz = new Scanner(System.in);
        double z = scanz.nextInt();
        double s = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел: " + s);
        if (Math.floor(s / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}