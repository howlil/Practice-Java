import javax.swing.JOptionPane;

public class Terminal {
    private PrizeCategory[] prizes;

    public Terminal(PrizeCategory[] prizes) {
        this.prizes = prizes;
    }

    public void loadCredits(Card card, int money) {
        card.addCredits(money * 2);
        JOptionPane.showMessageDialog(null, "Credits loaded successfully! New balance: " + card.getCreditBalance());
    }

    public void checkBalance(Card card) {
        JOptionPane.showMessageDialog(null, "Card Number: " + card.getCardNumber() + "\nCredits: " + card.getCreditBalance() + "\nTickets: " + card.getTicketBalance());
    }

    public void transferCredits(Card fromCard, Card toCard, int credits) {
        if (fromCard.getCreditBalance() >= credits) {
            fromCard.deductCredits(credits);
            toCard.addCredits(credits);
            JOptionPane.showMessageDialog(null, "Credits transferred successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient credits to transfer!");
        }
    }

    public void transferTickets(Card fromCard, Card toCard, int tickets) {
        if (fromCard.getTicketBalance() >= tickets) {
            fromCard.deductTickets(tickets);
            toCard.addTickets(tickets);
            JOptionPane.showMessageDialog(null, "Tickets transferred successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient tickets to transfer!");
        }
    }

    public void claimPrize(Card card, int prizeIndex) {
        if (prizes[prizeIndex].isAvailable()) {
            if (card.getTicketBalance() >= prizes[prizeIndex].getTicketsRequired()) {
                card.deductTickets(prizes[prizeIndex].getTicketsRequired());
                prizes[prizeIndex].claimPrize();
                JOptionPane.showMessageDialog(null, "Prize claimed successfully! Remaining tickets: " + card.getTicketBalance());
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient tickets to claim the prize!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, this prize is out of stock!");
        }
    }
}
