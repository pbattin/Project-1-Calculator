package battin.preston.Project1Calculator;


import java.util.InputMismatchException;
import java.util.Scanner;
@SuppressWarnings("Duplicates")

/**
 * Created by prestonbattin on 1/13/17.
 */
public class Calculator {

    static double intialVal = 0;
    static double currentVal;
    static String decision;
    static double calculatedNum;

    public static void main(String[] args) {

        boolean validation = false;
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Enter a number: " + intialVal);

        do {
            try {
                intialVal = getUserInput.nextDouble();
                validation = true;
            } catch (InputMismatchException notANumber) {
                validation = false;
                System.out.println("Enter a number!");
                getUserInput.nextLine();
            }
        }while (!validation);

        System.out.println(intialVal);
        System.out.println("What calculation would you like to perform?");
        getUserInput.nextLine();
        decision = getUserInput.nextLine();

        if (decision.equals("Clear")) {
            intialVal = 0;
            System.out.println("Enter a number: " + intialVal);

            do {
                try {
                    intialVal = getUserInput.nextDouble();
                    validation = true;
                } catch (InputMismatchException notANumber) {
                    validation = false;
                    System.out.println("Enter a number!");
                    getUserInput.nextLine();
                }
            }while (!validation);


            System.out.println(intialVal);
            System.out.println("What calculation would you like to perform?");
            getUserInput.nextLine();
            decision = getUserInput.nextLine();
        }
        Choice.Pick(decision);
        System.out.println(calculatedNum);

        while (true) {
            intialVal = calculatedNum;
            System.out.println("What calculation would you like to perform?");

            decision = getUserInput.nextLine();
            if (decision.equals("Clear")) {
                intialVal = 0;
                System.out.println("Enter a number: " + intialVal);

                do {
                    try {
                        intialVal = getUserInput.nextDouble();
                        validation = true;
                    } catch (InputMismatchException notANumber) {
                        validation = false;
                        System.out.println("Enter a number!");
                        getUserInput.nextLine();
                    }
                }while (!validation);

                System.out.println(intialVal);
                System.out.println("What calculation would you like to perform?");
                getUserInput.nextLine();
                decision = getUserInput.nextLine();
            }
            Choice.Pick(decision);
            System.out.println(calculatedNum);
        }
    }
}
