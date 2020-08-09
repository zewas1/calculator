import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static final Scanner scan = new Scanner(System.in);

    public static void getMenu() {
        int selection = 0;
        List<Double> resultHistory = new ArrayList<Double>();
        double result = 0;

        do {
            try {
                selection = getSelection();

                if (selection == 1) {
                    Calculator.calculationData();
                    result = Calculator.Sum();
                    resultFinal(resultHistory, result);
                } else if (selection == 2) {
                    Calculator.calculationData();
                    result = Calculator.Subtract();
                    resultFinal(resultHistory, result);
                } else if (selection == 3) {
                    Calculator.calculationData();
                    result = Calculator.Multiplication();
                    resultFinal(resultHistory, result);
                } else if (selection == 4) {
                    Calculator.calculationData();
                    result = Calculator.Division();
                    resultFinal(resultHistory, result);
                } else if (selection == 5) {
                    System.out.println(resultHistory);
                }
            } catch (Exception e) {
                System.out.println("Please use numbers for inserting any data");
            }
        } while (selection != 6);

    }

    private static void resultFinal(List<Double> resultHistory, double result) {
        System.out.println("Your result is: " + result);
        //System.out.println("Save data? 1. yes 2. no");
        //int selection = Integer.parseInt(scan.next());
        //if (selection == 1){
        resultHistory.add(result);
        //} else {
        //    System.out.println("Data is not saved.");
        //}
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
}
