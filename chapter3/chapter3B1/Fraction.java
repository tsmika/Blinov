package chapter3.chapter3B1;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction() {
		this(0, 1);
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.simplify();
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		this.simplify();
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
		this.simplify();
	}

	public Fraction add(Fraction fraction) {
		int numerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * denominator;
		int denominator = this.denominator * fraction.getDenominator();
		return new Fraction(numerator, denominator);
	}

	public Fraction substract(Fraction fraction) {
		int numerator = this.numerator * fraction.getDenominator() - fraction.getNumerator() * denominator;
		int denominator = this.denominator * fraction.getDenominator();
		return new Fraction(numerator, denominator);
	}

	public Fraction multiply(Fraction fraction) {
		int numerator = this.numerator * fraction.getNumerator();
		int denominator = this.denominator * fraction.getDenominator();
		return new Fraction(numerator, denominator);
	}

	public Fraction divide(Fraction fraction) {
		int numerator = this.numerator * fraction.getDenominator();
		int denominator = this.denominator * fraction.getNumerator();
		return new Fraction(numerator, denominator);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

	public void print() {
		System.out.print(" " + numerator + "/" + denominator + " \n");
	}

	private void simplify() {
		int gcd = findGCD(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	private static int findGCD(int x, int y) {

		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}

		return x;
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//