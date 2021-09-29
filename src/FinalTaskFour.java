import java.util.Scanner;

public class FinalTaskFour {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        byte j = 1;
        do {
            System.out.print("Ответ: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (j == 1 & str.equalsIgnoreCase("Подсказка")) {
                help();
                break;
            } else if (j != 1 & str.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else if (!(str.equalsIgnoreCase("Заархивированный вирус"))) {
                if (j == 3) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Подумай еще!");
                }
                j++;
            } else {
                System.out.println("Правильно!");
                j = 4;
            }
        } while (j < 4);
    }

    public static void help() {
        System.out.println("Шуба.zip");
        System.out.print("Ответ: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (!(str.equalsIgnoreCase("Заархивированный вирус"))) {
            System.out.println("Обидно, приходи в другой раз");
        } else {
            System.out.println("Правильно!");
        }
    }
}
