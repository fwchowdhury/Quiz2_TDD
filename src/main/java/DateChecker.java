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
        if (month == null) {
            throw new IllegalArgumentException("Month must not be null");
        }
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return true;
            default:
                return false;
        }
    }
}