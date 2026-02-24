package chapter2;

import java.util.Arrays;

//Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
public class Chapter2_A4 {
	public static void main(String[] args) {
		System.out.println("minUnique = " + getMinUniqueDigitsNumber(getRandomArray(10)));
	}

	private static int getMinUniqueDigitsNumber(int[] array) {
		int minUnique = countUniqueDigits(array[0]);
		int minUniqueIndex = 0;
		int current = 0;

		for (int i = 0; i < array.length; i++) {
			current = countUniqueDigits(array[i]);
			
			if (current < minUnique) {
				minUnique = current;
				minUniqueIndex = i;
			}
		}

		System.out.println("Index = " + minUniqueIndex);

		return array[minUniqueIndex];
	}

	private static int countUniqueDigits (int num) {
		String numStr = String.valueOf(Math.abs(num));
		int uniqueCount = 0;
		boolean[] seen = new boolean[10];

		for (int i = 0; i < numStr.length(); i++) {
			int current = numStr.charAt(i) - '0';

			if (!seen[current]) {
				seen[current] = true;
				uniqueCount++;
			}
		}

		return uniqueCount;
	}

	private static int[] getRandomArray(int n) {
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) ((Math.random() - 0.5) * Math.pow(10, (int) (Math.random() * 8)));
		}

		System.out.println(Arrays.toString(array));

		return array;
	}
}

