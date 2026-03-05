public abstract class Container implements Printable {

    private final String name;
    private final int capacity;

    protected Container(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
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

    @Override
    public String toString() {
        return "Контейнер [Название = '" + name + "', Вместимость = " + capacity + "]";
    }
}