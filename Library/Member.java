package Library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final String memberId;
    private final List<Book> borrowedBooks;

    public Member(String name, String memberId){
        this.name=name;
        this.memberId=memberId;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getName(){
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return memberId + ": " + name;
    }
}
