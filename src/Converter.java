import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        boolean o = false;
        while (!o) {
            System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
            Scanner scan = new Scanner(System.in);
            byte x = scan.nextByte();
            switch (x) {
                case 1:
                    o = true;
                    boolean i = false;
                    while (!i) {
                        System.out.print("Выберите единицу измерения: 1 - киллограм, 2 - фунт, 3 - униция, 4 - стоун: ");
                        byte e = scan.nextByte();
                        switch (e) {
                            case 1: //киллограм
                                double k = Enter();
                                kilogram(k);
                                i = true;
                                break;
                            case 2: //фунт
                                double f = Enter();
                                ib(f);
                                i = true;
                                break;
                            case 3: //унция
                                double u = Enter();
                                ounce(u);
                                i = true;
                                break;
                            case 4: //стоун
                                double s = Enter();
                                stone(s);
                                i = true;
                                break;
                            default:
                                System.out.println("Введено некорректное число");
                                break;
                        }
                    }
                    break;
                case 2:
                    o = true;
                    boolean j = false;
                    while (!j) {
                        System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
                        byte e = scan.nextByte();
                        switch (e) {
                            case 1: //метр
                                double me = Enter();
                                meter(me);
                                j = true;
                                break;
                            case 2: //миля
                                double mi = Enter();
                                mile(mi);
                                j = true;
                                break;
                            case 3: //ярд
                                double ya = Enter();
                                yard(ya);
                                j = true;
                                break;
                            case 4: //фут
                                double fo = Enter();
                                foot(fo);
                                j = true;
                                break;
                            default:
                                System.out.println("Введено некорректное число");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Введено некорректное число");
                    break;
            }
        }
    }


    //метод ввода
    private static double Enter() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    //метод вывода массы
    private static void outputWeight(double kg, double ib, double st, double unc) {
        System.out.println("Результат:");
        System.out.println("Киллограм: " + String.format("%.2f", kg));
        System.out.println("Фунт: " + String.format("%.2f", ib));
        System.out.println("Унция: " + String.format("%.2f", st));
        System.out.println("Стоун: " + String.format("%.2f", unc));
    }

    //метод вывода расстояния
    private static void outputLenght(double m, double mile, double yard, double feet) {
        System.out.println("Результат:");
        System.out.println("Метры: " + String.format("%.2f", m));
        System.out.println("Мили: " + String.format("%.2f", mile));
        System.out.println("Ярды: " + String.format("%.2f", yard));
        System.out.println("Футы: " + String.format("%.2f", feet));
    }

    // метод преобразования коллограмм
    private static void kilogram(double l) {
        double ib = l * 2.205; // киллограмы в фунты
        double unc = l * 35.274; // киллограмы в унции
        double st = l / 6.35; // киллограмы в стоуны
        outputWeight(l, ib, unc, st);
    }

    // метод преобразования фунтов
    private static void ib(double l) {
        double kg = l / 2.205;// фунты в киллограм
        double unc = l * 16; // фунты в унции
        double st = l / 15; // фунты в стоуны
        outputWeight(kg, l, unc, st);
    }

    // метод преобразования унции
    private static void ounce(double l) {
        double kg = l * 35.274;// унции в киллограм
        double ib = l / 16; // унции в футы
        double st = l / 224; // унции в стоуны
        outputWeight(kg, ib, l, st);
    }

    // метод преобразования стоунов
    private static void stone(double l) {
        double kg = l / 6.35;// стоуны в киллограм
        double ib = l * 14; // стоуны в футы
        double unc = l * 224; // стоуны в унции
        outputWeight(kg, ib, unc, l);
    }

    // метод преобразования метра
    private static void meter(double l) {
        double mile = l / 1609; // метры в мили
        double yard = l * 1.094; // метры в ярды
        double feet = l * 3.281; // метры в футы
        outputLenght(l, mile, yard, feet);
    }

    // метод преобразования мили
    private static void mile(double l) {
        double m = l * 1609;// мили в метры
        double yard = l * 1760; // мили в ярды
        double feet = l * 5280; // мили в футы
        outputLenght(m, l, yard, feet);
    }

    // метод преобразования ярда
    private static void yard(double l) {
        double m = l / 1.094;// ярды в метры
        double mile = l / 1760; // ярды в мили
        double feet = l * 3; // ярды футы
        outputLenght(m, mile, l, feet);
    }

    // метод преобразования футов
    private static void foot(double l) {
        double m = l / 3.281;// футы в метры
        double mile = l / 5280; // футы в мили
        double yard = l / 3; // футы в ярды
        outputLenght(m, mile, yard, l);

    }
}