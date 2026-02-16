package chapter2;

import java.util.Arrays;
//import java.util.Scanner;

/*
Ввести n чисел с консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа
и их длину.
 */

public class Chapter2_A1 {

	public static void main(String[] args) {
		findMaxMin();
	}

	private static void findMaxMin() {
		int length = 10;
		int[] array = new int[length];
//		array = inputArray(length);
		array = getRandomArray(length);

		System.out.println(Arrays.toString(array));

		int min = array[0];
		int minLength = array[0];
		int max = array[0];
		int maxLength = array[0];

		for (int i = 0; i < array.length; i++) {

			if (min > array[i]) {
				min = array[i];
				minLength = String.valueOf(min).length();
			}

			if (max < array[i]) {
				max = array[i];
				maxLength = String.valueOf(max).length();
			}
		}

		System.out.println("Max number: " + max + ", length: " + maxLength);
		System.out.println("Min number: " + min + ", length: " + minLength);
	}

	private static int[] getRandomArray(int n) {
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * Math.pow(10, (int) (Math.random() * 8)));
		}

		return array;
	}

//	private static int[] inputArray(int n) {
//		int[] array = new int[n];
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Input " + n + " integer numbers:");
//		for (int i = 0; i < n; i++) {
//			array[i] = scanner.nextInt();
//		}
//
//		scanner.close();
//
//		return array;
//	}

}
