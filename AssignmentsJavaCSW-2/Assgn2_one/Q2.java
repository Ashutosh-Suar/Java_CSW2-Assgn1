package Assgn2_one;

class Book {
    private int bookId;
    private String bookName;
    private double price;

    // Constructor
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Override toString() to return book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + "\nBook Name: " + bookName + "\nPrice: $" + price;
    }

    // Override equals() to compare books based on price
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0;
    }
}

public class Q2 {

    public static void main(String[] args) {

        // Instantiate two Book objects
        Book book1 = new Book(101, "Java Programming", 39.99);
        Book book2 = new Book(102, "Python Basics", 29.99);

        // Print book details
        System.out.println("Book 1 Details:\n" + book1);
        System.out.println("\nBook 2 Details:\n" + book2);

        // Compare books based on price
        if (book1.equals(book2)) {
            System.out.println("\nBoth books have the same price.");
        } else if (book1.getPrice() > book2.getPrice()) {
            System.out.println("\nBook 1 is more expensive than Book 2.");
        } else {
            System.out.println("\nBook 2 is more expensive than Book 1.");
        }

    }
}
