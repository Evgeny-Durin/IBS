public class Array {
    public static int getRandomDiceNumber() {
        return (int) (Math.random() * 6);
    }
    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println("Задание 1:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getRandomDiceNumber();
            System.out.print(" " + myArray[i] + " ");
        }
        System.out.println();
        System.out.println("Задание 2:");
        int x = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = x;
        for (int j : myArray) {
            System.out.print(" " + j + " ");
        }
        System.out.println();
        System.out.println("Задание 3:");
        int a =  myArray[0] + myArray[myArray.length / 2];
        System.out.print("Сумма первого и среднего элементов = " + a);
    }
}



