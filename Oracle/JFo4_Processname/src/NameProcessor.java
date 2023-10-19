import java.util.Scanner;

public class NameProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Type your name: ");
        String fullName = scanner.nextLine();

        // Split the name into first and last name
        String[] names = fullName.split(" ");
        String firstName = names[0];
        String lastName = names[1];

        // Extract first initial and last name
        char firstInitial = firstName.charAt(0);

        // Display the result
        System.out.println(lastName + ", " + firstInitial);
    }
}
