import java.util.ArrayList;

public class Book {

    private ArrayList<Book> books;

    public Book(String bookTitle){
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

}
