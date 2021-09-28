import java.util.Scanner;

public class DataWorkOne {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();
        String z = Integer.toString(x);
        System.out.print("Введите второе число: ");
        Integer y = scan.nextInt();
        int result = x.compareTo(y);
        double min;
        switch (result) {
            case 1:
                System.out.println("Большее число: " + x);
                min = y.doubleValue();
                System.out.print("Меньшее число: " + min);
                break;
            case 0:
                System.out.println("Числа равны");
                break;
            case -1:
                System.out.println("Большее число: " + y);
                min = x.doubleValue();
                System.out.print("Меньшее число: " + min);
                break;

        }
    }
}

