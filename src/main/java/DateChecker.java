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
     * Returns whether the given month has 31 days.
     * February returns false because this method only models 31-day months.
     *
     * @param month the month to check; must not be null
     * @return true for January, March, May, July, August, October, and December
     * @throws IllegalArgumentException if month is null
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