import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scanX = new Scanner(System.in);
        double x = scanX.nextInt();
        System.out.print("Введите второе число: ");
        Scanner scanY = new Scanner(System.in);
        double y = scanY.nextInt();
        System.out.print("Введите третье число: ");
        Scanner scanZ = new Scanner(System.in);
        double z = scanZ.nextInt();
        double s = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел: " + s);
        double r = Math.floor(s / 2);
        //System.out.println("Среднее арифметическое введенных чисел, деленное на 2: " + r);
        if (r > 3) {
            System.out.println("Программа выполнена корректно");
    /*} else {
           System.out.println("Программа выполнена некорректно");*/
        }
    }
}