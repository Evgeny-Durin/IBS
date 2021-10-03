import java.util.Scanner;

public class AddTask {
    public static void main(String[] args) {
        int arraySizeOne = arraySizeEnter(1);
        double[] arrayOne = arrayEnter(arraySizeOne);
        int arraySizeTwo = arraySizeEnter(2);
        double[] arrayTwo = arrayEnter(arraySizeTwo);
        double avgOne = arrayAvg(arrayOne, arraySizeOne);
        double maxTwo = arrayMax(arrayTwo, arraySizeTwo);
        if (avgOne > maxTwo) {
            System.out.println("Среднее арифметическое первого массива: " + avgOne);
        } else if (avgOne < maxTwo) {
            System.out.println("Максимальный элемент второго массива: " + maxTwo);
        } else {
            System.out.println("Максимальный элемент второго массива равен среднему арифметическому первого массива: " + maxTwo);
        }
    }

    private static double[] arrayEnter(int size) {
        double[] array = new double[size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int arraySizeEnter(int number) {
        int size = 0;
        do {
            System.out.print("Введите размер " + number + " массива: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                size = scan.nextInt();
                if (size <= 0) {
                    System.out.println("Некорректный ввод");
                } else {
                    break;
                }
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        while (size <= 0);
        return size;
    }

    private static double arrayAvg(double[] array, int size) {
        double avg = 0;
        for (int i = 0; i < size; i++) {
            avg += array[i];
        }
        avg /= size;
        return avg;
    }

    private static double arrayMax(double[] array, int size) {
        double max = array[0];
        for (int i = 1; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}