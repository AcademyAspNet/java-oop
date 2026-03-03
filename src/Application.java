public class Application {

    static void main() {
        Fraction firstFraction = new Fraction(1, 2);
        System.out.println("Числитель: " + firstFraction.getNumerator());
        System.out.println("Знаменатель: " + firstFraction.getDenominator());

        Fraction secondFraction = new Fraction(3, 4);
        secondFraction.print();

        Fraction sum = firstFraction.add(secondFraction);
        sum.print();

        Fraction thirdFraction = new Fraction(16, 128);
        thirdFraction.print();

    /*
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
     */
    }
}
