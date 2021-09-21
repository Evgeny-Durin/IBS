import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        boolean o = false;
        while (!o) {
            System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
            Scanner scanX = new Scanner(System.in);
            byte x = scanX.nextByte();
            switch (x) {
                case 1 -> {
                    o = true;
                    boolean i = false;
                    while (!i) {
                        System.out.print("Выберите единицу измерения: 1 - киллограм, 2 - фунт, 3 - униция, 4 - стоун: ");
                        Scanner scanE = new Scanner(System.in);
                        byte e = scanE.nextByte();
                        switch (e) {
                            case 1 -> {//киллограм
                                double k = Enter();
                                double[] kilogramArray = kilogram(k);
                                outputWeight(kilogramArray);
                                i = true;
                            }
                            case 2 -> {//фунт
                                double f = Enter();
                                double[] ibArray = ib(f);
                                outputWeight(ibArray);
                                i = true;
                            }
                            case 3 -> {//унция
                                double u = Enter();
                                double[] ounceArray = ounce(u);
                                outputWeight(ounceArray);
                                i = true;
                            }
                            case 4 -> {//стоун
                                double s = Enter();
                                double[] stoneArray = stone(s);
                                outputWeight(stoneArray);
                                i = true;
                            }
                            default -> System.out.println("Введено некорректное число");
                        }
                    }
                }
                case 2 -> {
                    o = true;
                    boolean j = false;
                    while (!j) {
                        System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
                        Scanner scanE = new Scanner(System.in);
                        byte e = scanE.nextByte();
                        switch (e) {
                            case 1 -> {//метр
                                double me = Enter();
                                double[] meterArray = meter(me);
                                outputLeght(meterArray);
                                j = true;
                            }
                            case 2 -> {//миля
                                double mi = Enter();
                                double[] mileArray = mile(mi);
                                outputLeght(mileArray);
                                j = true;
                            }
                            case 3 -> {//ярд
                                double ya = Enter();
                                double[] yardArray = yard(ya);
                                outputLeght(yardArray);
                                j = true;
                            }
                            case 4 -> {//фут
                                double fo = Enter();
                                double[] footArray = foot(fo);
                                outputLeght(footArray);
                                j = true;
                            }
                            default -> System.out.println("Введено некорректное число");
                        }
                    }
                }
                default -> System.out.println("Введено некорректное число");
            }
        }

    }
    //метод ввода
    private static double Enter() {
        System.out.print("Введите число: ");
        Scanner scanL = new Scanner(System.in);
        return scanL.nextByte();
    }
    //метод вывода массы
    private static void outputWeight(double[] m) {

        System.out.println("Результат:");
        System.out.println("Киллограм: " + m[0]);
        System.out.println("Фунт: " + m[1]);
        System.out.println("Унция: " + m[2]);
        System.out.println("Стоун: " + m[3]);
    }
    //метод вывода расстояния
    private static void outputLeght(double[] m) {

        System.out.println("Результат:");
        System.out.println("Метры: " + m[0]);
        System.out.println("Мили: " + m[1]);
        System.out.println("Ярды: " + m[2]);
        System.out.println("Футы: " + m[3]);
    }
    // метод преобразования коллограмм
    private static double[] kilogram (double l){
        double[] m = new double[4];
        m[0] = l;// киллограмы
        m[1] = l * 2.205; // киллограмы в фунты
        m[2] = l * 35.274; // киллограмы в унции
        m[3] = l / 6.35; // киллограмы в стоуны
        return m;
    }
    // метод преобразования фунтов
    private static double[] ib (double l) {
        double[] m = new double[4];
        m[0] = l / 2.205;// фунты в киллограм
        m[1] = l; // фунты
        m[2] = l * 16; // фунты в унции
        m[3] = l / 15; // фунты в стоуны
        return m;
    }

    // метод преобразования унции
    private static double[] ounce (double l) {
        double[] m = new double[4];
        m[0] = l * 35.274;// унции в киллограм
        m[1] = l / 16; // унции в футы
        m[2] = l; // унции
        m[3] = l / 224; // унции в стоуны
        return m;
    }
    // метод преобразования стоунов
    private static double[] stone (double l) {
        double[] m = new double[4];
        m[0] = l / 6.35;// стоуны в киллограм
        m[1] = l * 14; // стоуны в футы
        m[2] = l * 224; // стоуны в унции
        m[3] = l; // стоуны
        return m;
    }
    // метод преобразования метра
    private static double[] meter (double l) {
        double[] m = new double[4];
        m[0] = l;// метры
        m[1] = l / 1609; // метры в мили
        m[2] = l * 1.094; // метры в ярды
        m[3] = l * 3.281; // метры в футы
        return m;
    }
    // метод преобразования мили
    private static double[] mile (double l) {
        double[] m = new double[4];
        m[0] = l * 1609;// мили в метры
        m[1] = l; // мили
        m[2] = l * 1760; // мили в ярды
        m[3] = l * 5280; // мили в футы
        return m;
    }
    // метод преобразования ярда
    private static double[] yard (double l) {
        double[] m = new double[4];
        m[0] = l / 1.094;// ярды в метры
        m[1] = l / 1760; // ярды в мили
        m[2] = l; // ярды
        m[3] = l * 3; // ярды футы
        return m;
    }
    // метод преобразования футов
    private static double[] foot (double l) {
        double[] m;
        m = new double[4];
        m[0] = l / 3.281;// футы в метры
        m[1] = l / 5280; // футы в мили
        m[2] = l / 3; // футы в ярды
        m[3] = l; // футы
        return m;
    }
}