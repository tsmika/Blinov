package chapter3.chapter3B1;

/*
 Реализовать методы сложения, вычитания, умножения и деления объектов.
	1. Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
	Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. 
	Создать массив/список/множество объектов и передать его в метод, который изменяет каждый
	элемент массива с четным индексом путем добавления следующего за ним элемента.
*/
public class chapter3B1 {

	public static void main(String[] args) {
		Fraction[] fractions = generate();
		printArray(fractions);
		changeEvens(fractions);
		printArray(fractions);

	}

	private static void changeEvens(Fraction[] fraction) {
		for (int i = 0; i < fraction.length - 1; i++) {
			if (i % 2 == 0) {
				fraction[i] = fraction[i].add(fraction[i + 1]);
			}
		}
	}

	private static Fraction[] generate() {
		Fraction[] fractions = new Fraction[30];

		for (int i = 0; i < 30; i++) {
			int numerator = (int) (Math.random() * 100 + 1);
			int denominator = (int) (Math.random() * 100 + 1);
			fractions[i] = new Fraction(numerator, denominator);
			System.out.print(String.format("%-3s", i) + ": ");
			fractions[i].print();
		}

		return fractions;
	}

	private static void printArray(Fraction[] fractions) {
		for (int i = 0; i < fractions.length; i++) {
			System.out.print(String.format("%-3s", i) + ": ");
			fractions[i].print();
		}
	}
}
