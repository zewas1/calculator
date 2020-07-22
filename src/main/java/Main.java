import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);
    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        int selection = 0;


        do {
            selection = getSelection();

            if (selection == 1) {
                calculationData();
                System.out.println("Your result is: " + Calculator.Sum(x, y));
            } else if (selection == 2) {
                calculationData();
                System.out.println("Your result is: " + Calculator.Subtract(x, y));
            } else if (selection == 3) {
                calculationData();
                System.out.println("Your result is: " + Calculator.Multiplication(x, y));
            } else if (selection == 4) {
                calculationData();
                System.out.println("Your result is: " + Calculator.Division(x, y));
            }
        } while (selection != 5);

    }

    private static int getSelection() {
        int selection;
        System.out.println("*****************************************");
        System.out.println("*              Calculator               *");
        System.out.println("*****************************************");
        System.out.println("* Please select one of these functions: *");
        System.out.println("* 1 Count sum                           *");
        System.out.println("* 2 Count subtraction                   *");
        System.out.println("* 3 Count multiplication                *");
        System.out.println("* 4 Count division                      *");
        System.out.println("* 5 Exit                                *");
        System.out.println("*****************************************");
        selection = Integer.parseInt(scan.next());
        return selection;
    }

    private static void calculationData() {
        System.out.println("Insert first value");
        x = Integer.parseInt(scan.next());
        System.out.println("Insert second value");
        y = Integer.parseInt(scan.next());
    }
}
