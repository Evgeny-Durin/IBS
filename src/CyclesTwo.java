import java.util.Scanner;

public class CyclesTwo {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            int s = 0;
            for (int i = 1; i <= n; i = i + 2) {
                s += i;
            }
            System.out.println("Сумма нечетных чисел = " + s);
        } else {
            System.out.println("Введено отрицательное число или 0");
        }
    }
}
