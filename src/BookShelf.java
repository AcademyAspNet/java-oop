public class BookShelf extends Container {

    public BookShelf() {
        super("Книжный шкаф");
    }

    @Override
    public void displayInfo() {
        System.out.println("Это книжный шкаф и его вместимость - " + getCapacity() + " книги.");
    }
}
