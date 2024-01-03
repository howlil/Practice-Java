package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCrud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n--- LinkedList CRUD Operations ---");
            System.out.println("1. Add Element");
            System.out.println("2. Display Elements");
            System.out.println("3. Update Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Search Element");
            System.out.println("6. Queue and Stack Operations");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    list.add(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("LinkedList: " + list);
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
                    queueAndStackOperations(list, scanner);
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

    private static void queueAndStackOperations(LinkedList<String> list, Scanner scanner) {
        System.out.println("\n--- Queue and Stack Operations ---");
        System.out.println("1. Add to Queue (offer)");
        System.out.println("2. Remove from Queue (poll)");
        System.out.println("3. Peek Queue");
        System.out.println("4. Push to Stack");
        System.out.println("5. Pop from Stack");
        System.out.print("Choose an operation: ");
        int op = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (op) {
            case 1:
                System.out.print("Enter element to add to queue: ");
                list.offer(scanner.nextLine());
                break;
            case 2:
                System.out.println("Element removed from queue: " + list.poll());
                break;
            case 3:
                System.out.println("Element at front of queue: " + list.peek());
                break;
            case 4:
                System.out.print("Enter element to push to stack: ");
                list.push(scanner.nextLine());
                break;
            case 5:
                System.out.println("Element popped from stack: " + list.pop());
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
    }
}
