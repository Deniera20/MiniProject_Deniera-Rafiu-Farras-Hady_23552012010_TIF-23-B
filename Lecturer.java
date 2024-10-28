public class Lecturer extends LibraryMember {
    private String code;

    public Lecturer(String name, int memberId, String alamat,  String code) {
        super(name, memberId, alamat);
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Lecturer) has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}