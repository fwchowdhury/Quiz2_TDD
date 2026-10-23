import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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

    @Test
    public void testDivide() {
        int expected = 2;
        int actual = calculator.divide(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    public void testIsOdd() {
        assertFalse(calculator.isEven(3));
    }
}