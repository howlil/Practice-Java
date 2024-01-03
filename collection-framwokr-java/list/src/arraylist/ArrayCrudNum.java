package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCrudNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- CRUD Operations for ArrayList ---");
            System.out.println("1. Add Element");
            System.out.println("2. Show Elements");
            System.out.println("3. Update Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Search Element");
            System.out.println("6. Display Size of ArrayList");
            System.out.println("7. Queue Operations");
            System.out.println("8. Stack Operations");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    list.add(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("Elements in ArrayList: " + list);
                    break;

                case 3:
                    System.out.print("Enter element to update: ");
                    String oldElement = scanner.nextLine();
                    System.out.print("Enter new element: ");
                    String newElement = scanner.nextLine();
                    int indexToUpdate = list.indexOf(oldElement);
                    if (indexToUpdate != -1) {
                        list.set(indexToUpdate, newElement);
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter element to delete: ");
                    String elementToDelete = scanner.nextLine();
                    if (list.remove(elementToDelete)) {
                        System.out.println("Element removed successfully.");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter element to search: ");
                    String elementToSearch = scanner.nextLine();
                    if (list.contains(elementToSearch)) {
                        System.out.println("Element found in the list.");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 6:
                    System.out.println("Size of ArrayList: " + list.size());
                    break;

                case 7: // Queue Operations
                    queueOperations(list, scanner);
                    break;

                case 8: // Stack Operations
                    stackOperations(list, scanner);
                    break;

                case 9: // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;

            }
        } while (choice != 9);

        scanner.close();
    }
    private static void queueOperations(ArrayList<String> list, Scanner scanner) {
        System.out.println("\n--- Queue Operations ---");
        System.out.println("1. Enqueue Element");
        System.out.println("2. Dequeue Element");
        System.out.print("Enter your choice: ");
        int op = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (op) {
            case 1: // Enqueue
                System.out.print("Enter element to enqueue: ");
                list.add(scanner.nextLine());
                System.out.println("Element enqueued.");
                break;
            case 2: // Dequeue
                if (!list.isEmpty()) {
                    System.out.println("Element dequeued: " + list.remove(0));
                } else {
                    System.out.println("Queue is empty.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    private static void stackOperations(ArrayList<String> list, Scanner scanner) {
        System.out.println("\n--- Stack Operations ---");
        System.out.println("1. Push Element");
        System.out.println("2. Pop Element");
        System.out.print("Enter your choice: ");
        int op = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (op) {
            case 1: // Push
                System.out.print("Enter element to push: ");
                list.add(scanner.nextLine());
                System.out.println("Element pushed.");
                break;
            case 2: // Pop
                if (!list.isEmpty()) {
                    System.out.println("Element popped: " + list.remove(list.size() - 1));
                } else {
                    System.out.println("Stack is empty.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
