import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {

    static void main() throws Exception {
        BookShelf bookShelf = new BookShelf();
        readFirstBook(bookShelf);
    }

    static void readFirstBook(BookShelf bookShelf) throws EmptyBookShelfException {
        Book firstBook = bookShelf.getFirstBook();
        System.out.println("Читаем книгу " + firstBook + "...");
    }
}
