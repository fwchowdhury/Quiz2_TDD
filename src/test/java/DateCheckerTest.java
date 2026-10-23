import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    public void testMonthsWith31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month), "Expected 31 days for " + month);
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testMonthsWithout31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month), "Expected fewer than 31 days for " + month);
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY));
    }

    @Test
    public void testNullMonthThrows() {
        assertThrows(IllegalArgumentException.class, () -> dateChecker.has31Days(null));
    }
}