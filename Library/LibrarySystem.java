package Library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Malgudi Days", "R.K. Narayana"));
        library.addBook(new Book("Covenant of Water", "Abraham Verghese"));
        library.addBook(new Book("Ivory Throne", "Manu S. Pillai"));

        library.addMember(new Member("Alice", "M001"));
        library.addMember(new Member("Bob", "M002"));
        library.addMember(new Member("Claire", "M003"));

        library.printLibraryStatus();

        library.borrowBook("M001", "Ivory Throne");
        library.borrowBook("M002", "Covenant of Water");

        library.printLibraryStatus();

        library.returnBook("M001", "Ivory Throne");

        library.printLibraryStatus();

    }
}
