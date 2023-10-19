import javax.swing.JOptionPane;

public class Game {
    private int creditsRequired;

    public Game(int creditsRequired) {
        this.creditsRequired = creditsRequired;
    }

    public void play(Card card) {
        if (card.getCreditBalance() < creditsRequired) {
            JOptionPane.showMessageDialog(null, "Insufficient credits!");
            return;
        }

        int ticketsWon = (int) (Math.random() * 10) + 1; // Random tickets between 1 and 10
        card.deductCredits(creditsRequired);
        card.addTickets(ticketsWon);

        JOptionPane.showMessageDialog(null, "Card: " + card.getCardNumber() + "\nTickets won: " + ticketsWon + "\nNew ticket balance: " + card.getTicketBalance());
    }
}
