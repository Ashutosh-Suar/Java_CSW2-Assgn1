package Assgn2_two;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", name='" + name + "', author='" + author + "', quantity=" + quantity + "}";
    }
}

public class Q5 {

    public static void main(String[] args) {

        HashMap<Integer, Book> bookMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding books to the HashMap
        bookMap.put(101, new Book(101, "The Alchemist", "Paulo Coelho", 5));
        bookMap.put(102, new Book(102, "1984", "George Orwell", 3));

        // Display books in the HashMap
        System.out.println("Library Collection:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // (a) Check if a book name exists
        System.out.println("Enter book name to search:");
        String searchName = scanner.nextLine();
        boolean found = bookMap.values().stream().anyMatch(book -> book.getName().equalsIgnoreCase(searchName));

        if (found) {
            System.out.println("The book is available in the library.");
        } else {
            System.out.println("The book is not in the library.");
        }

        // (b) Remove a book by key
        System.out.println("Enter book ID to remove:");
        int removeId = scanner.nextInt();
        if (bookMap.remove(removeId) != null) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book ID not found.");
        }

        // Display updated book list
        System.out.println("Updated Library Collection:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        scanner.close();

    }
}
