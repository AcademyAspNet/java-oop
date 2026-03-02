public class Application {

    static void main() {
        Figure circle = new Figure("Круг", "Черный");

        circle.setName("Circle");
        circle.setColor("Black");

        System.out.println(circle.getName());
        System.out.println(circle.getColor());

        Figure rectangle = new Figure("Прямоугольник", "Белый");

        System.out.println(rectangle.getName());
        System.out.println(rectangle.getColor());

        Figure cube = new Figure("Куб", "Белый");

        System.out.println(cube.getName());
        System.out.println(cube.getColor());
    }
}
