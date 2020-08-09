public class Calculator {

    public static int x = 0;
    public static int y = 0;

    public static int Sum() {
        return x + y;
    }

    public static int Subtract() {
        return x - y;
    }

    public static double Multiplication() {
        return x * y;
    }

    public static double Division() {
        return (double) x / y;
    }

    static void calculationData() {
        System.out.println("Insert first value");
        x = Integer.parseInt(Menu.scan.next());
        System.out.println("Insert second value");
        y = Integer.parseInt(Menu.scan.next());
    }
}
