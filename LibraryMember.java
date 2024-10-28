public abstract class LibraryMember {
    private String name, alamat;
    private int memberId;

    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getalamat(){
        return alamat;
    }

    // Abstraksi metode umum yang harus diimplementasikan oleh subclass
    public abstract void borrowBook(Book book);
}