package chapter2;

import java.util.Arrays;
//8. Среди чисел массива найти число-палиндром. Если таких чисел больше одного, найти второе.

public class Chapter2_A8 {
	public static void main(String[] args) {
		int[] array = getRandomArray(50);
		int count = 0;
		int result = 0;

		for (int i : array) {
			if (isPalindrome(i)) {

				count++;

				if (count > 1) {
					System.out.println(i);
					return;
				}

				result = i;
			}
		}

		if (count == 1) {
			System.out.println(result);
		} else {
			System.out.println("No palindromes in the array.");
		}
	}

	private static boolean isPalindrome(int num) {
		String stringNum = Integer.toString(num);
		String reverse = new StringBuilder(stringNum).reverse().toString();
		return stringNum.equals(reverse);
	}

	private static int[] getRandomArray(int n) {
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * Math.pow(10, (int) (Math.random() * 5 + 3)));
		}

		System.out.println(Arrays.toString(array));

		return array;
	}
}
