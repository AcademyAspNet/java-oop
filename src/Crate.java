public class Crate extends Container {

    public Crate() {
        super("Ящик");
    }

    @Override
    public void displayInfo() {
        System.out.println("Это ящик и его вместимость - " + getCapacity() + " предметов.");
    }
}
