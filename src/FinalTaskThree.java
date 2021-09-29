import java.util.Scanner;

public class FinalTaskThree {
    public static void main(String[] args) {
        System.out.print("Введите число строк: ");
        int n;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            n = scan.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");
            return;
        }
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("строка " + (i + 1) + ": ");
            strings[i] = scan.next();
        }
        scan.close();
        int j = 0;
        long max = strings[0].chars().distinct().count();
        for (int i = 0; i < n; i++) {
            if (max < strings[i].chars().distinct().count()) {
                max = strings[i].chars().distinct().count();
                j = i;
            }
        }
        System.out.print("Ответ: " + strings[j]);
    }
}

