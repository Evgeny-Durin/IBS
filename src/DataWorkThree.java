import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataWorkThree {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArray = str.split(" ");
        byte j = 0;
        for (int i = 0; i < strArray.length; i++) {
            Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
            Matcher matcher = p.matcher(strArray[i]);
            if (matcher.find()) {
                System.out.println(strArray[i]);
                j++;
            }
        }
        System.out.println("Количество слов состоящих только из латиницы: " + j);
    }
}