package chapter2;

import java.util.Arrays;

// 5. 1) Найти количество чисел, содержащих только четные цифры, 2) количество чисел с равным числом четных и нечетных цифр.

public class Chapter2_A5 {

	public static void main(String[] args) {
		int[] randomArray = getRandomArray(20);

		int[] onlyEven = getContainOnlyEvenDigits(randomArray);
		System.out.println("onlyEven: " + Arrays.toString(onlyEven));
		System.out.println("number of even: " + onlyEven.length);

		int[] equal = getNumbersWithEqualEvenAndOddDigits(randomArray);
		System.out.println("onlyEqual: " + Arrays.toString(equal));
		System.out.println("number of equal: " + equal.length);
	}

	private static int[] getNumbersWithEqualEvenAndOddDigits(int[] array) {
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (hasEqualEvenAndOddDigits(array[i])) count++;
		}

		int[] equal = new int[count];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if (hasEqualEvenAndOddDigits(array[i])) equal[index++] = array[i];
		}

		return equal;
	}

	private static boolean hasEqualEvenAndOddDigits(int num) {
		String strNum = String.valueOf(Math.abs(num));

		if (strNum.length() % 2 != 0) {
			return false;
		}

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < strNum.length(); i++) {
			int curr = strNum.charAt(i) - '0';

			if (curr % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		return countEven == countOdd;
	}

	private static int[] getContainOnlyEvenDigits(int[] array) {
		boolean[] evenDigits = new boolean[array.length];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			evenDigits[i] = hasOnlyEvenDigits(array[i]);
		}

		for (boolean item : evenDigits) {
			if (item == true)
				count++;
		}

		int[] evenArray = new int[count];
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (evenDigits[i] == true) {
				evenArray[j++] = array[i];
			}
		}

		return evenArray;
	}

	private static boolean hasOnlyEvenDigits(int num) {
		String numStr = String.valueOf(Math.abs(num));

		for (int i = 0; i < numStr.length(); i++) {
			int current = numStr.charAt(i) - '0';
			if (current % 2 != 0)
				return false;
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
