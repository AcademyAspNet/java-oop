public class BookShelf extends Container {

    public BookShelf() {
        super("Книжный шкаф");
    }

    @Override
    public void print() {
        System.out.println("Это книжный шкаф и его вместимость - " + getCapacity() + " книги.");
    }
}
