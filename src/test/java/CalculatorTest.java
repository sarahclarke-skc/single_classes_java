import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(10, calculator.subtract(15, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(10.00, calculator.divide(20.00, 2.00), 0.00);
    }
}
