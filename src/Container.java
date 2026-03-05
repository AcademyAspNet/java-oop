public abstract class Container<T> implements Printable {

    private final String name;
    private final int capacity;

    private final Object[] items;
    private int nextIndex;

    protected Container(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.items = new Object[capacity];
        this.nextIndex = 0;
    }

    protected Container(String name) {
        this(name, 32);
    }

    protected Container(int capacity) {
        this("Без названия", capacity);
    }

    protected Container() {
        this("Без названия", 32);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getItemCount() {
        return nextIndex;
    }

    public void addItem(T item) {
        items[nextIndex] = item;
        nextIndex++;
    }

    public T getItem(int index) {
        return (T) items[index];
    }

    @Override
    public String toString() {
        return "Контейнер [" +
                "Название = '" + name + "', " +
                "Вместимость = " + capacity + ", " +
                "Кол-во предметов = " + nextIndex + "]";
    }
}