import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calc.add(10, 5));
        assertEquals(-5, calc.add(-10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
        assertEquals(-15, calc.subtract(-10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calc.multiply(10, 5));
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.divide(10, 5));
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
