package Assgn1;

// Abstract class LibraryResource
abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
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

// Book class
class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
        System.out.println("---------------------------");
    }
}

// Magazine class
class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("---------------------------");
    }
}

// DVD class
class DVD extends LibraryResource {
    private double duration;

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " hours");
        System.out.println("---------------------------");
    }
}

public class Q7 {

    public static void main(String[] args) {

        // Creating instances of Library Resources
        LibraryResource book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        LibraryResource magazine = new Magazine("National Geographic", "Various", "March 2025");
        LibraryResource dvd = new DVD("Inception", "Christopher Nolan", 2.5);

        // Displaying details of each resource
        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();

    }
}
