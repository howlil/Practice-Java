public class PrizeCategory {
    private String name;
    private int ticketsRequired;
    private int count;

    public PrizeCategory(String name, int ticketsRequired, int count) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.count = count;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public boolean isAvailable() {
        return count > 0;
    }

    public void claimPrize() {
        if (isAvailable()) {
            count--;
        }
    }
}
