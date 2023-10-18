import java.util.ArrayList;
import java.util.List;

public class Library {
    private String catalogID;
    private List<Book> books = new ArrayList<>();
    private String librarian;

    public Library(String catalogID, String librarian) {
        this.catalogID = catalogID;
        this.librarian = librarian;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the catalog.");
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the catalog.");
        } else {
            System.out.println("Book not found in the catalog.");
        }
    }

    public List<Book> searchCatalog(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getIsbn().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getBooks() {
        return books;
    }
}
