package Library;

public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String title, String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available){
        this.isAvailable=available;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " - " + (isAvailable ? "Available" : "Borrowed");
    }
}





