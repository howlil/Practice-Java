import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Enter the name of the hero: ");
        String heroName = scanner.nextLine();

        System.out.print("Enter the age of the hero: ");
        int heroAge = scanner.nextInt();

        System.out.print("Enter the height of the hero in meters (e.g., 1.75): ");
        double heroHeight = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter the name of the stolen artifact: ");
        String artifactName = scanner.nextLine();

        System.out.print("Enter the weight of the artifact in kilograms (e.g., 2.5): ");
        double artifactWeight = scanner.nextDouble();

        System.out.print("Enter the number of challenges the hero faces: ");
        int challengesCount = scanner.nextInt();

        System.out.print("Enter the name of the hero's trusty sidekick: ");
        String sidekickName = scanner.nextLine();
        scanner.nextLine();  // Consume the newline

        System.out.print("Enter the amount of gold coins the hero has: ");
        int goldCoins = scanner.nextInt();

        System.out.print("Enter the price of a potion in gold coins: ");
        int potionPrice = scanner.nextInt();

        System.out.print("Enter the amount of potions the hero wants to buy: ");
        int potionCount = scanner.nextInt();

        // Calculations
        double jumpHeight = heroHeight * 1.5;
        int totalCost = potionPrice * potionCount;
        int remainingCoins = goldCoins - totalCost;

        // Print the story
        System.out.println("\n\nIn a magical town, " + heroName + ", aged " + heroAge + ", embarked on a journey to retrieve the stolen " + artifactName + " which weighed " + artifactWeight + " kilograms.");
        System.out.println(heroName + " was not alone, for " + sidekickName + " was always by their side. They faced " + challengesCount + " challenges on their journey.");
        System.out.println("With a height of " + heroHeight + " meters, " + heroName + " could jump up to " + jumpHeight + " meters!");
        System.out.println("Before the final challenge, " + heroName + " decided to buy some potions. Each potion cost " + potionPrice + " gold coins.");
        System.out.println("After buying " + potionCount + " potions, " + heroName + " had " + remainingCoins + " gold coins left.");
        System.out.println("With renewed energy, our hero continued the journey, hopeful to retrieve the " + artifactName + ".");
    }
}
