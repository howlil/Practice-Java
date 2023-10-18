public class Book {
    private String isbn, title, author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkAvailability() {
        if (isAvailable) {
            System.out.println("The book is available for borrowing.");
        } else {
            System.out.println("The book is currently unavailable.");
        }
    }

    public void reserve() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have reserved the book.");
        } else {
            System.out.println("The book is already available.");
        }
    }

    public void updateInformation(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Book information updated.");
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
