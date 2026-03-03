public class Student extends Human {

    public Student(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, меня зовут " + name + " и я - студент!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
