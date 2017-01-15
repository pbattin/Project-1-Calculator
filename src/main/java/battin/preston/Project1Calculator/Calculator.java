package battin.preston.Project1Calculator;


import java.util.InputMismatchException;
import java.util.Scanner;

import static battin.preston.Project1Calculator.Choice.Pick;
import static battin.preston.Project1Calculator.Display.calculatedNum;
import static battin.preston.Project1Calculator.Display.decision;
import static battin.preston.Project1Calculator.Display.intialVal;

@SuppressWarnings("Duplicates")

/**
 * Created by prestonbattin on 1/13/17.
 */
public class Calculator {


    public static void main(String[] args) {

        Display menu = new Display();
        menu.setDisplay();
    }
}
