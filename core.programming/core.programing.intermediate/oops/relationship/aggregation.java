package relationship;
import java.util.*;

class library {
    String libraryName;
    ArrayList<book> b;

    public library(String libraryName) {
        this.libraryName = libraryName;
        b = new ArrayList<>();
    }

    void addBook(book b1) {
        b.add(b1);
    }

    void displayBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (book b2 : b) {
            b2.display();
        }
    }
}   // ✅ FIX: closed library class properly

// Book class (separate class)
class book {
    String title;
    String author;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

// Main class
public class aggregation {
    public static void main(String[] args) {

        book v1 = new book("java", "radhika");
        book v2 = new book("math", "krishna");

        library l1 = new library("radha ballabh");
        library l2 = new library("ram");

        l1.addBook(v1);
        l1.addBook(v2);

        l2.addBook(v1);
        l2.addBook(v2);

        l1.displayBooks();
        l2.displayBooks();
    }
}