import java.util.ArrayList;

public class Library {

    private String libraryName;
    private int maxBooks;
    private ArrayList<Book> libraryBooks;

    public Library(String libraryName, int maxBooks){
        this.libraryName = libraryName;
        this.maxBooks = maxBooks;
        this.libraryBooks = new ArrayList<>();
    }

    public int getNumberOfBooks() {
        return this.libraryBooks.size();
    }

    public void addBookToLibrary(Book book){
        this.libraryBooks.add(book);
    }

    public int getCapacity(){
        return this.maxBooks;
    }

    public int availableSpace(){
        return (getCapacity() - getNumberOfBooks());
    }
}
