package battin.preston.Project1Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


import static battin.preston.Project1Calculator.Calculator.currentVal;
import static battin.preston.Project1Calculator.Calculator.intialVal;
@SuppressWarnings("Duplicates")

/**
 * Created by prestonbattin on 1/13/17.
 */
public class Choice {

    static public void Pick(String option) {
        Scanner calcBy = new Scanner(System.in);
        boolean validation = false;

        switch (option) {
            case "Add": {
                System.out.println("By what number would you like to add?");
                do {
                    try {
                        currentVal = calcBy.nextDouble();
                        validation = true;
                    } catch (InputMismatchException notANum) {
                        validation = false;
                        System.out.println("Enter a number!");
                        calcBy.nextLine();
                    }
                } while (!validation);

                CalculateBasicFunctions.CalcAddtion(currentVal, intialVal);
                break;
            }

            case "Subtract": {
                System.out.println("By what number would you like to subtract?");
                do {
                    try {
                        currentVal = calcBy.nextDouble();
                        validation = true;
                    } catch (InputMismatchException notANum) {
                        validation = false;
                        System.out.println("Enter a number!");
                        calcBy.nextLine();
                    }
                } while (!validation);

                CalculateBasicFunctions.CalcSubtraction(currentVal, intialVal);
                break;
            }

            case "Divide": {
                System.out.println("By what number would you like to divide?");
                do {
                    try {
                        currentVal = calcBy.nextDouble();
                        validation = true;
                    } catch (InputMismatchException notANum) {
                        validation = false;
                        System.out.println("Enter a number!");
                        calcBy.nextLine();
                    }
                } while (!validation);
                CalculateBasicFunctions.CalcDivision(currentVal, intialVal);
                break;
            }

            case "Multiply": {
                System.out.println("By what number would you like to multiply by?");
                do {
                    try {
                        currentVal = calcBy.nextDouble();
                        validation = true;
                    } catch (InputMismatchException notANum) {
                        validation = false;
                        System.out.println("Enter a number!");
                        calcBy.nextLine();
                    }
                } while (!validation);
                CalculateBasicFunctions.CalcMultiplication(currentVal, intialVal);
                break;
        }

            case "Clear":
                intialVal = 0;
                System.out.println(intialVal);

            default:
                System.out.println("Options: Add, Subtract, Divide, Multiply, Clear.");

        }
    }
}
