import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
