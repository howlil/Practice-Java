import javax.swing.JOptionPane;

public class Jfx {

    public static void main(String[] args) {

        // Get inputs from the user using JOptionPane
        String heroName = JOptionPane.showInputDialog("Enter the name of the hero:");
        int heroAge = Integer.parseInt(JOptionPane.showInputDialog("Enter the age of the hero:"));
        double heroHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the hero in meters (e.g., 1.75):"));
        String artifactName = JOptionPane.showInputDialog("Enter the name of the stolen artifact:");
        double artifactWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter the weight of the artifact in kilograms (e.g., 2.5):"));
        int challengesCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of challenges the hero faces:"));
        String sidekickName = JOptionPane.showInputDialog("Enter the name of the hero's trusty sidekick:");
        int goldCoins = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of gold coins the hero has:"));
        int potionPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of a potion in gold coins:"));
        int potionCount = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of potions the hero wants to buy:"));

        // Calculations
        double jumpHeight = heroHeight * 1.5;
        int totalCost = potionPrice * potionCount;
        int remainingCoins = goldCoins - totalCost;

        // Construct the story
        String story = "\n\nIn a magical town, " + heroName + ", aged " + heroAge + ", embarked on a journey to retrieve the stolen " + artifactName + " which weighed " + artifactWeight + " kilograms."
                      + "\n" + heroName + " was not alone, for " + sidekickName + " was always by their side. They faced " + challengesCount + " challenges on their journey."
                      + "\nWith a height of " + heroHeight + " meters, " + heroName + " could jump up to " + jumpHeight + " meters!"
                      + "\nBefore the final challenge, " + heroName + " decided to buy some potions. Each potion cost " + potionPrice + " gold coins."
                      + "\nAfter buying " + potionCount + " potions, " + heroName + " had " + remainingCoins + " gold coins left."
                      + "\nWith renewed energy, our hero continued the journey, hopeful to retrieve the " + artifactName + ".";

        // Display the story using JOptionPane
        JOptionPane.showMessageDialog(null, story);
    }
}
