import javax.swing.JOptionPane;

public class ArcadeDriver {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        PrizeCategory[] prizes = {
            new PrizeCategory("Toy", 50, 10),
            new PrizeCategory("Gadget", 100, 5),
            new PrizeCategory("Gift Card", 150, 3)
        };

        Terminal terminal = new Terminal(prizes);
        Game game = new Game(5);  // Assuming each game costs 5 credits

        while (true) {
            String action = JOptionPane.showInputDialog("Choose an action:\n1. Load Credits\n2. Play Game\n3. Transfer Credits/Tickets\n4. Claim Prize\n5. Exit");
            switch (action) {
                case "1":
                    int money = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of money to load:"));
                    int cardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the card number (1 or 2):"));
                    Card cardToLoad = (cardNumber == 1) ? card1 : card2;
                    terminal.loadCredits(cardToLoad, money);
                    break;
                case "2":
                    cardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the card number (1 or 2) to play the game:"));
                    Card cardToPlay = (cardNumber == 1) ? card1 : card2;
                    game.play(cardToPlay);
                    break;
                case "3":
                    int sourceCardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the source card number (1 or 2):"));
                    int destCardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the destination card number (1 or 2):"));
                    int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of credits/tickets to transfer:"));
                    Card sourceCard = (sourceCardNumber == 1) ? card1 : card2;
                    Card destCard = (destCardNumber == 1) ? card1 : card2;
                    String transferType = JOptionPane.showInputDialog("Choose transfer type (Credits/Tickets):");
                    if ("Credits".equalsIgnoreCase(transferType)) {
                        terminal.transferCredits(sourceCard, destCard, amount);
                    } else {
                        terminal.transferTickets(sourceCard, destCard, amount);
                    }
                    break;
                case "4":
                    cardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the card number (1 or 2) to claim a prize:"));
                    int prizeIndex = Integer.parseInt(JOptionPane.showInputDialog("Choose a prize:\n0. Toy\n1. Gadget\n2. Gift Card"));
                    Card cardToClaim = (cardNumber == 1) ? card1 : card2;
                    terminal.claimPrize(cardToClaim, prizeIndex);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
