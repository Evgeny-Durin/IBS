import java.util.Scanner;

public class CyclesOne {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        boolean k = true;
        int[] myArray = new int[j];
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.print("Массив[" + i + "] = ");
            Scanner scanArray = new Scanner(System.in);
            myArray[i] = scanArray.nextInt();
            switch (myArray[i]) {
                case 1://x
                case 2://y
                case 3://z
                    k = false;
            }
        }
        if (!k) {
            System.out.print("Данное значение имеется в константах ");
        }
    }
}