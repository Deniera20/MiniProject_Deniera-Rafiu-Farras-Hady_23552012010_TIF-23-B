import java.util.List;
import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel about wealth and society", 15000));
        books.add(new Book("1984", "George Orwell", "Dystopian social science fiction", 12000));
        books.add(new Book("Filosofi Teras", "Henry Manampiring", "Self Improvement", 20000));
        books.add(new Book("The Art of Thinking Clearly", "Rolf Dobelli", "Self Improvement", 18000));

        

        // Library members
        LibraryMember student = new Student("Alice", 1001, "123 Main St", "S123456");
        LibraryMember lecturer = new Lecturer("Mr. Smith", 2001, "456 Elm St", "L987654");

        // Polymorphism: Both student and teacher are treated as LibraryMember
        student.borrowBook(books.get(0)); // Alice (Student) borrows "The Great Gatsby"
        System.out.println("\n");
        lecturer.borrowBook(books.get(0)); // "The Great Gatsby" is already borrowed, so Mr. Smith can't borrow it.
        lecturer.borrowBook(books.get(1)); // Mr. Smith (Teacher) borrows "1984"
        System.out.println("\n");
        student.borrowBook(books.get(2));

        int lateDays = 5;
        double finePerDay = 2000;
        double totalFine = calcutaleFine(lateDays, finePerDay);
        System.out.println("Harga total jika pengembalian buku telat : Rp " + totalFine);
    }

    public static double calcutaleFine(int lateDays, double finePerDay){
        return lateDays * finePerDay;
    }
}
