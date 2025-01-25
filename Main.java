// Abstraction
import java.util.List;
import java.util.ArrayList;

abstract class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void displayDetails();
}

// Inheritance
class Fiction extends Book {
    public Fiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor());
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor());
    }
}

// Encapsulation
class Library {
    private String libraryName;
    private List<Book> books = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

// Polymorphism
public class Main {
    public static void main(String[] args) {
        Library library = new Library("Kiddos Central Library");

        // Adding books
        Book book1 = new Fiction("Harry Potter", "J.K. Rowling");
        Book book2 = new NonFiction("A Brief History of Time", "Stephen Hawking");

        library.addBook(book1);
        library.addBook(book2);

        // Displaying all books
        library.displayBooks();
    }
}
