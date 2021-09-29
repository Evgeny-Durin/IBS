import java.util.Scanner;

public class DataWorkOne {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();
        String z = Integer.toString(x);
        System.out.print("Введите второе число: ");
        int y = scan.nextInt();
        int result = x.compareTo(y);
        if (result == 1) {
            System.out.println("Большее число: " + x);
            System.out.print("Меньшее число: " + (double) y);
        } else if (result == 0) {
            System.out.println("Числа равны");
        } else
            System.out.println("Большее число: " + y);
        System.out.print("Меньшее число: " + x.doubleValue());
    }
}

