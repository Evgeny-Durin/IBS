import java.util.Scanner;

public class CyclesFour {
    public static void main(String[] args) {
        System.out.print("Введите количество строк матрицы: ");
        Scanner scanX = new Scanner(System.in);
        int x = scanX.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        Scanner scanY = new Scanner(System.in);
        int y = scanY.nextInt();
        int[][] myArray = new int[x][y];
        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= y - 1; j++) {
                System.out.print("Матрица[" + i + "," + j + "] = ");
                Scanner scanArray = new Scanner(System.in);
                myArray[i][j] = scanArray.nextInt();
            }
        }
        for (int j = 0; j <= y - 1; j++) {
            System.out.print(myArray[0][j] * 3 + " ");
        }
    }
}