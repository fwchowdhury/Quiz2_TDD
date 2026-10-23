import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = -1;
        int actual = calculator.subtract(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;
        int actual = calculator.multiply(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyByZero() {
        int expected = 0;
        int actual = calculator.multiply(5, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegative() {
        int expected = -6;
        int actual = calculator.multiply(-2, 3);
        assertEquals(expected, actual);
    }
}