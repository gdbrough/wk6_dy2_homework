import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void before(){
//        book = new Book();
        library = new Library("My Library", 5);
    }

    @Test
    public void libraryStartsOfEmpty(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBooksToLibrary(){
        book = new Book("Lord of the Rings");
        library.addBookToLibrary(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void checkLibraryCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void checkAvailableSpace(){
        book = new Book("Lord of the Rings");
        library.addBookToLibrary(book);
        assertEquals(1, library.getNumberOfBooks());
        assertEquals(4, library.availableSpace());
    }

}
