import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID, name, email;
    private List<Book> borrowedBooks = new ArrayList<>();
    private Library library;

    public User(String userID, String name, String email, Library library) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.library = library;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.add(book);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You haven't borrowed this book.");
        }
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
