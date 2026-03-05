public class Crate<T> extends Container<T> {

    public Crate() {
        super("Ящик");
    }

    @Override
    public void print() {
        System.out.println("Это ящик и его вместимость - " + getCapacity() + " предметов.");
    }
}
