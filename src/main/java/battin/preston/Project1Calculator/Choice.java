package battin.preston.Project1Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import static battin.preston.Project1Calculator.Display.*;
@SuppressWarnings("Duplicates")

/**
 * Created by prestonbattin on 1/13/17.
 */
public class Choice {

    static Scanner calcBy = new Scanner(System.in);
    static double mr = 0 ;

    static private void selectAddition() {
        System.out.println("By what number would you like to add?");
        do {
            try {
                currentVal = calcBy.nextDouble();
                validation = true;
            } catch (InputMismatchException notANum) {
                validation = false;
                Pick(calcBy.nextLine());
                //System.out.println("Enter a number!");
                //calcBy.nextLine();
            }
        } while (!validation);

        CalculateBasicFunctions.CalcAddtion(currentVal, intialVal);
        displayinfoAfterCalculating();
    }
    static private void selectSubtraction(){

        System.out.println("By what number would you like to subtract?");
        do {
            try {
                currentVal = calcBy.nextDouble();
                validation = true;
            } catch (InputMismatchException notANum) {
                validation = false;
                Pick(calcBy.nextLine());
                //System.out.println("Enter a number!");
                //calcBy.nextLine();
            }
        } while (!validation);

        CalculateBasicFunctions.CalcSubtraction(currentVal, intialVal);
        displayinfoAfterCalculating();
    }
    static private  void selectDivision(){

        System.out.println("By what number would you like to divide?");
        do {

            try {
                currentVal = calcBy.nextDouble();
                while(currentVal == 0){
                    System.out.println("ERROR: CANNOT DIVIDE BY ZERO");
                    Pick(calcBy.nextLine());
                    //System.out.println("Enter another number:");
                    //currentVal = calcBy.nextDouble();
                }
                validation = true;
            } catch (InputMismatchException notANum) {
                validation = false;
                Pick(calcBy.nextLine());
               // System.out.println("Enter a number!");
               // calcBy.nextLine();
            }
        } while (!validation);
        CalculateBasicFunctions.CalcDivision(currentVal, intialVal);
        displayinfoAfterCalculating();
    }
    static private void selectMultiply(){

        System.out.println("By what number would you like to multiply by?");
        do {
            try {
                currentVal = calcBy.nextDouble();
                validation = true;
            } catch (InputMismatchException notANum) {
                validation = false;
                Pick(calcBy.nextLine());
                //System.out.println("Enter a number!");
                //calcBy.nextLine();
            }
        } while (!validation);
        CalculateBasicFunctions.CalcMultiplication(currentVal, intialVal);
        displayinfoAfterCalculating();
    }
    static public void selectM(){

        System.out.println("Value stored in memory.");
        mr = intialVal;
        calculatedNum = mr;
    }
    static public void selectMC(){

        System.out.println("Memory cleared.");
        mr = 0;
        calculatedNum = mr;
    }
    static public void selectMRC(){
        calculatedNum = mr;
    }


    static public void Pick(String option) {

        switch (option) {
            case "Add": {
                selectAddition();
                break;
            }

            case "Subtract": {
                selectSubtraction();
                break;
            }

            case "Divide": {
                selectDivision();
                break;
            }

            case "Multiply": {
                selectMultiply();
                break;
        }

            case "Square": {

                CalculateScientificFunction.CalcSquare(intialVal);
                displayinfoAfterCalculating();
                break;
            }

            case "Cube": {

                CalculateScientificFunction.CalcCube(intialVal);
                displayinfoAfterCalculating();
                break;
            }

            case "Square Root": {

                CalculateScientificFunction.CalcSquareRoot(intialVal);
                displayinfoAfterCalculating();
                break;
            }

            case "Inverse": {
                if(intialVal == 0){
                    System.out.println("CANNOT GET INVERSE OF 0.");
                    clearDisplay();
                }
                CalculateScientificFunction.CalcInverse(intialVal);
                displayinfoAfterCalculating();
                break;
            }

            case "PI":

                CalculateScientificFunction.CalcPI();
                displayinfoAfterCalculating();

            case "M":
                selectM();
                displayinfoAfterCalculating();
                break;

            case "MC":
                selectMC();
                clearDisplay();
                break;

            case "MRC":
                selectMRC();
                displayinfoAfterCalculating();
                break;

            case "Clear": {
               Display.clearDisplay();
                break;
            }

            default:
                System.out.println("Options: Add, Subtract, Divide, Multiply, Square, Cube, Square Root, Inverse," +
                        " PI, M, MC, MRC, Clear.");
                displayinfoAfterCalculating();

        }
    }
}
