import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings");
        book.addBook(book);
    }

    @Test
    public void getBook(){
        assertEquals("Lord of the Rings", book.getBooks());
    }


}
