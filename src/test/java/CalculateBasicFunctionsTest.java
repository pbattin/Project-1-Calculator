import battin.preston.Project1Calculator.CalculateBasicFunctions;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by prestonbattin on 1/13/17.
 */
public class CalculateBasicFunctionsTest {

    @Test
    public void CalcAdditionTest(){
        double addBy = 2, numToAdd = 2;
        assertEquals(4, CalculateBasicFunctions.CalcAddtion(numToAdd, addBy),.01);
    }

    @Test
    public void CalcSubtractionTest(){
        double subtractBy = 2, numToSuctract = 2;
        assertEquals(0, CalculateBasicFunctions.CalcSubtraction(numToSuctract, subtractBy), .01);
    }

    @Test
    public void CalcDivisionTest(){
        double divideBy = 2, numToDivide = 2;
        assertEquals(1, CalculateBasicFunctions.CalcDivision(numToDivide, divideBy), .01);
    }

    @Test
    public void CalcMultiplcationTest(){
        double multiplyBy = 2, numToMultiply = 2;
        assertEquals(4, CalculateBasicFunctions.CalcMultiplication(numToMultiply, multiplyBy), .01);
    }
}
