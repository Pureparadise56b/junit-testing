import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void test(){
    Calculator calculator = new Calculator();

    double result = calculator.divide(10, 2);
    double expectedResult = 5.0;

    assertEquals(expectedResult, result);
 }
}
