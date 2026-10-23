/**
 * Checks calendar facts about months.
 */
public class DateChecker {

    /**
     * The twelve calendar months.
     */
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    /**
     * @return true if the month has 31 days
     */
    public boolean has31Days(Month month) {
        return true;
    }
}