/**
 * Basic integer arithmetic used to practice TDD.
 */
public class Calculator {

    /**
     * @return the sum of x and y
     */
    public int sum(int x, int y) {
        return x + y;
    }

    /**
     * @return x minus y
     */
    public int subtract(int x, int y) {
        return x - y;
    }

    /**
     * @return the product of x and y
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * Integer division. Throws ArithmeticException when y is zero.
     *
     * @return the integer quotient of x divided by y
     */
    public int divide(int x, int y) {
        return x / y;
    }

    /**
     * @return true if value is even, false otherwise
     */
    public boolean isEven(int value) {
        return value % 2 == 0;
    }
}