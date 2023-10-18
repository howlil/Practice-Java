import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Welcome to the Library ======");
        System.out.print("Input UserID: ");
        String userID = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();

        Library library = new Library("Library1", "Librarian1");
        User user1 = new User(userID, name, email, library);

        while (true) {
            System.out.println("\n===== Options =====");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.println("3. Search for books");
            System.out.println("4. Add a book to the catalog");
            System.out.println("5. List all books in the catalog");
            System.out.println("6. Remove a book from the catalog");
            System.out.println("7. Quit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String isbnToBorrow = scanner.nextLine();
                    Book bookToBorrow = findBookByISBN(library, isbnToBorrow);
                    if (bookToBorrow != null) {
                        user1.borrowBook(bookToBorrow);
                    } else {
                        System.out.println("Book not found in the catalog.");
                    }
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to return: ");
                    String isbnToReturn = scanner.nextLine();
                    Book bookToReturn = findBorrowedBookByISBN(user1, isbnToReturn);
                    if (bookToReturn != null) {
                        user1.returnBook(bookToReturn);
                    } else {
                        System.out.println("You haven't borrowed this book.");
                    }
                    break;

                case 3:
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    List<Book> searchResult = library.searchCatalog(keyword);
                    if (!searchResult.isEmpty()) {
                        System.out.println("\nSearch Results:");
                        for (Book book : searchResult) {
                            System.out.println(book.getTitle() + " by " + book.getAuthor());
                        }
                    } else {
                        System.out.println("No books found matching your search.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ISBN of the book to add: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author of the book: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(isbn, title, author);
                    library.addBook(newBook);
                    System.out.println("Book added to the catalog.");
                    break;

                case 5:
                    List<Book> booksInCatalog = library.getBooks();
                    if (booksInCatalog.isEmpty()) {
                        System.out.println("Books is empty.");
                    } else {
                        System.out.println("\nBooks in the catalog:");
                        for (Book book : booksInCatalog) {
                            System.out.println("ISBN: " + book.getIsbn() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    Book bookToRemove = findBookByISBN(library, isbnToRemove);
                    if (bookToRemove != null) {
                        library.removeBook(bookToRemove);
                        System.out.println("Book removed from the catalog.");
                    } else {
                        System.out.println("Book not found in the catalog.");
                    }
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }

            

        }
    }

    private static Book findBookByISBN(Library library, String isbn) {
        for (Book book : library.getBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private static Book findBorrowedBookByISBN(User user, String isbn) {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
       
    }
    
}
