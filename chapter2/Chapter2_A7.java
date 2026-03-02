package chapter2;

import java.util.Arrays;

// 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

public class Chapter2_A7 {

	public static void main(String[] args) {
		int[] array = getRandomArray(20);
		findNumberWithAllUniqueDigits(array);
	}

	private static int findNumberWithAllUniqueDigits(int[] array) {

		for (int item : array) {
			if (hasAllUniqueDigits(item)) {
				System.out.println(item);
				return item;
			}
		}

		return 0;
	}

	private static boolean hasAllUniqueDigits(int number) {
		int num = Math.abs(number);

		if (num < 10)
			return true;

		boolean[] seen = new boolean[10];
		String strNum = String.valueOf(num);

		for (int i = 0; i < strNum.length(); i++) {
			int digit = strNum.charAt(i) - '0';

			if (seen[digit])
				return false;

			seen[digit] = true;
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
