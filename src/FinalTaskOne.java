import java.util.Scanner;

public class FinalTaskOne {
    public static void main(String[] args) {
        System.out.print("Курс доллара: ");
        Scanner scan = new Scanner(System.in);
        double ex = scan.nextDouble();
        System.out.print("Количество рублей: ");
        double rub = scan.nextDouble();
        System.out.println("Итого: " + String.format("%.2f", rub / ex) + " долларов");
    }
}
