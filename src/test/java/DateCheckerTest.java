import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @Test
    public void testJanuaryHas31Days() {
        assertTrue(dateChecker.has31Days(DateChecker.Month.JANUARY));
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY));
    }
}