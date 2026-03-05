public class Application {

    static void main() {
        Crate<String> crateOfStrings = new Crate<>();

        crateOfStrings.addItem("Яблоко");
        crateOfStrings.addItem("Апельсин");
        crateOfStrings.addItem("Морковь");

        for (int i = 0; i < crateOfStrings.getItemCount(); i++) {
            String string = crateOfStrings.getItem(i);
            System.out.println(string);
        }
    }
}
