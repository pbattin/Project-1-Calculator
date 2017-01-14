package battin.preston.Project1Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import static battin.preston.Project1Calculator.Display.*;

/**
 * Created by prestonbattin on 1/13/17.
 */
public class CalculateBasicFunctions {



    static public double CalcAddtion(double addBy, double numToAdd){

        return Display.calculatedNum = numToAdd + addBy;
    }

    static public double CalcSubtraction(double subtractBy, double numToSubtract){

        return Display.calculatedNum = numToSubtract - subtractBy;
    }

    static public double CalcDivision(double divideBy, double numToDivide) {

        return Display.calculatedNum = numToDivide / divideBy;
    }


    static public double CalcMultiplication(double multiplyBy, double numToMultiply){

        return Display.calculatedNum = numToMultiply * multiplyBy;
    }


}
