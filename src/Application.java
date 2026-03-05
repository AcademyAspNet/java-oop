public class Application {

    static void main() {
        Printable crate = new Crate();
        Container bookShelf = new BookShelf();

        printInfo(crate);
        printInfo(bookShelf);
    }

    static void printInfo(Printable printable) {
        printable.print();
    }
}
