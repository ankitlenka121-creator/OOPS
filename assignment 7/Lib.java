import java.util.ArrayList;

class Library {

    ArrayList<String> books = new ArrayList<>();

    void addBook(String book) {
        books.add(book);
        System.out.println(book + " added.");
    }

    void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    void displayBooks() {
        System.out.println("\nBooks in Library:");

        for (String book : books) {
            System.out.println(book);
        }
    }
}

public class Lib {
    public static void main(String[] args) {

        Library l = new Library();

        l.addBook("Java");
        l.addBook("Data Structures");
        l.addBook("Computer Networks");

        l.displayBooks();

        l.removeBook("Data Structures");

        l.displayBooks();
    }
}