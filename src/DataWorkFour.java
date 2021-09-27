import java.util.Random;

public class DataWorkFour {
    public static void main(String[] args) {
        Random random = new Random();
        double[] myArray = new double[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = ((double) 20 + (random.nextDouble() * (-20 - 20)));
        }
        double max, min;
        min = max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            } else if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + String.format("%.2f", max));
        System.out.println("Минимальный элемент массива: " + String.format("%.2f", min));
        System.out.println("Максимальный по модулю из минимального и максимального элементов: " + String.format("%.2f", (Math.max(Math.abs(max), Math.abs(min)))));
    }
}