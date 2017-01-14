import battin.preston.Project1Calculator.CalculateScientificFunction;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by prestonbattin on 1/13/17.
 */
public class CalculateScientificFunctionTest {

    @Test
    public void CalcSquareTest(){
        double num = 4;
        assertEquals(16, CalculateScientificFunction.CalcSquare(num), .01);
    }

    @Test
    public void CalcSquareRootTest(){
        double num = 4;
        assertEquals(2, CalculateScientificFunction.CalcSquareRoot(num), .01);
    }

    @Test
    public void CalcInverseTest(){
        double num = 2;
        assertEquals(.5, CalculateScientificFunction.CalcInverse(num), .01);

    }

}
