package battin.preston.Project1Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static battin.preston.Project1Calculator.Choice.*;

@SuppressWarnings("Duplicates")

/**
 * Created by prestonbattin on 1/14/17.
 */
public class Display {

    static double intialVal;
    static double currentVal;
    static String decision;
    static double calculatedNum;
    static boolean validation = false;
    static Scanner getUserInput = new Scanner(System.in);


    private static void getInitialNumber() {
        boolean validation = false;
        Scanner getUserInput = new Scanner(System.in);
        intialVal = 0;
        System.out.println("Enter a number: " + intialVal);
        do {

            try {
                intialVal = getUserInput.nextDouble();
                validation = true;
            } catch (InputMismatchException notANumber) {
                //validation = false;
                //System.out.println("Enter a number!");
                //getUserInput.nextLine();
                Pick(getUserInput.nextLine());

            }
        } while (!validation);
        calculatedNum = intialVal;

    }


    private static void getDecision() {
        System.out.println(intialVal);
        System.out.println("What calculation would you like to perform?");
        decision = getUserInput.nextLine();
    }

    private static void pickMathOperation() {

        if (decision.equals("Inverse") && intialVal == 0) {
                System.out.println("ERROR: CANNOT GET INVERSE OF ZERO");
                clearDisplay();
        } else Pick(decision);

    }

    public static void clearDisplay() {

            setDisplay();
        }


    public static void displayinfoAfterCalculating() {
        intialVal = calculatedNum;
        System.out.println(calculatedNum);
        System.out.println("What calculation would you like to perform?");
        decision = getUserInput.nextLine();
        pickMathOperation();


    }


    public static void setDisplay() {

        getInitialNumber();
        getDecision();
        pickMathOperation();

    }


}