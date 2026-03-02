package chapter2;

import java.util.Arrays;

// 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

public class Chapter2_A6 {

	public static void main(String[] args) {
		int[] array = getRandomArray(20);
		findAllNumbersWithIncreasingDigits(array);
	}

	private static void findAllNumbersWithIncreasingDigits(int[] array) {

		for (int item : array) {
			if (hasStrictlyIncreasingDigits(item)) {
				System.out.println(item);
			}
		}
	}

	private static boolean hasStrictlyIncreasingDigits(int number) {

		int num = Math.abs(number);

		if (num < 10) {
			return true;
		}

		int previousDigit = num % 10;
		num = num / 10;

		while (num > 0) {

			int currDigit = num % 10;
			
			if (currDigit >= previousDigit)
				return false;

			num = num / 10;
			previousDigit = currDigit;
		}

		return true;
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
