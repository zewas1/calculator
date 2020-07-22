import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);
    public static int x = 0;
    public static int y = 0;

    public static void main(String[] args) {
        int selection = 0;
        List<Double> resultHistory = new ArrayList<Double>();
        double result = 0;

        do {
            try {
                selection = getSelection();

                if (selection == 1) {
                    calculationData();
                    result = Calculator.Sum(x, y);
                    resultFinal(resultHistory, result);
                } else if (selection == 2) {
                    calculationData();
                    result = Calculator.Subtract(x, y);
                    resultFinal(resultHistory, result);
                } else if (selection == 3) {
                    calculationData();
                    result = Calculator.Multiplication(x, y);
                    resultFinal(resultHistory, result);
                } else if (selection == 4) {
                    calculationData();
                    result = Calculator.Division(x, y);
                    resultFinal(resultHistory, result);
                }
                else if (selection == 5){
                    System.out.println(resultHistory);
                }
            } catch (Exception e){
                System.out.println("Please use numbers for inserting any data");
            }
        } while (selection != 6);

    }

    private static void resultFinal(List<Double> resultHistory, double result) {
        System.out.println("Your result is: " + result);
        resultHistory.add(result);
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
        System.out.println("* 5 Result History                      *");
        System.out.println("* 6 Exit                                *");
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
