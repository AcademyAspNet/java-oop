import java.util.Objects;

public class Human {

    final String name;

    public Human(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + name + "!");
    }

    @Override
    public String toString() {
        return "Человек [Имя = '" + name + "']";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;

        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
