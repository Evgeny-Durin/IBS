import java.util.Scanner;

public class CyclesThree {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scanJ = new Scanner(System.in);
        int j = scanJ.nextInt();
        double s = 0;
        double[] myArray = new double[j];
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.print("Массив[" + i + "] = ");
            Scanner scanArray = new Scanner(System.in);
            myArray[i] = scanArray.nextDouble();
            s += myArray[i];
        }
        s /= j;
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.print(myArray[i] * s + " ");
        }
    }
}
