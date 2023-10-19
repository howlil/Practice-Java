public class Card {
    private static int uniqueID = 1000;
    private int cardNumber;
    private int creditBalance;
    private int ticketBalance;

    public Card() {
        this.cardNumber = uniqueID++;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void addCredits(int credits) {
        this.creditBalance += credits;
    }

    public void deductCredits(int credits) {
        if (this.creditBalance >= credits) {
            this.creditBalance -= credits;
        }
    }

    public void addTickets(int tickets) {
        this.ticketBalance += tickets;
    }

    public void deductTickets(int tickets) {
        if (this.ticketBalance >= tickets) {
            this.ticketBalance -= tickets;
        }
    }
}
