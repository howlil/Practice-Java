package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Hashsetcrud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int choice;

        do {
            System.out.println("\n--- HashSet CRUD Operations ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Check if Element Exists");
            System.out.println("4. Display Elements");
            System.out.println("5. Check Size");
            System.out.println("6. Clear HashSet");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    boolean added = set.add(scanner.nextLine());
                    if (added) {
                        System.out.println("Element added.");
                    } else {
                        System.out.println("Element already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    boolean removed = set.remove(scanner.nextLine());
                    if (removed) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to check: ");
                    boolean exists = set.contains(scanner.nextLine());
                    if (exists) {
                        System.out.println("Element exists in the HashSet.");
                    } else {
                        System.out.println("Element does not exist.");
                    }
                    break;

                case 4:
                    System.out.println("HashSet Elements: " + set);
                    break;

                case 5:
                    System.out.println("Size of HashSet: " + set.size());
                    break;

                case 6:
                    set.clear();
                    System.out.println("HashSet cleared.");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
}
