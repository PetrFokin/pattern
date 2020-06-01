package behavior.strategy;

public class Test {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.setPriceStrategy(getPriceStrategy(Day.MONDAY));
        System.out.println(cinema.getTicketCost("Big Lebowski"));
        cinema.setPriceStrategy(getPriceStrategy(Day.SUNDAY));
        System.out.println(cinema.getTicketCost("Disgusting eight"));

    }

    private static PriceStrategy getPriceStrategy(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            default:
                return new WeekdayPriceStrategy(1);
            case SATURDAY:
            case SUNDAY:
                return new WeekendPriceStrategy(3);
        }
    }
}
