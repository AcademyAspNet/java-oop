public class BookShelf extends Container<Book> {

    public BookShelf() {
        super("Книжный шкаф");
    }

    @Override
    public void print() {
        System.out.println("Это книжный шкаф и его вместимость - " + getCapacity() + " книги.");
    }
}
