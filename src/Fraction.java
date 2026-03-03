public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }

    public Fraction add(Fraction other) {
        int commonDenominator = denominator * other.denominator;
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);

        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction subtract(Fraction other) {
        int commonDenominator = denominator * other.denominator;
        int newNumerator = (numerator * other.denominator) - (other.numerator * denominator);

        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;

        return new Fraction(newNumerator, newDenominator);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
