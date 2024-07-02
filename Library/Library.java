package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    List<Book> books;
    HashMap<String, Member> members;
    public Library(){
        books = new ArrayList<>();
        members = new HashMap<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.put(member.getMemberId(), member);
    }

    public boolean borrowBook(String memberId, String bookTitle){
        Member m1 = members.get(memberId);
        for(Book book : books){
            if(book.getTitle().equals(bookTitle) && book.isAvailable()){
                book.setAvailable(false);
                m1.borrowBook(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String memberId, String bookTitle){
        Member m1 = members.get(memberId);
        for(Book book: m1.getBorrowedBooks()){
            if(book.getTitle().equals(bookTitle)){
                book.setAvailable(true);
                m1.returnBook(book);
                return true;
            }
        }
        return false;
    }

    public void printLibraryStatus(){
        System.out.println("Books in library: ");
        for(Book book: books){
            System.out.println(book);
        }

        System.out.println("Members");
        for(String memberId :members.keySet()){
            System.out.println(members.get(memberId));
        }
        System.out.println("*******************");
    }

}
