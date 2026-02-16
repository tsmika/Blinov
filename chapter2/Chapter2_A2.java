package chapter2;

import java.util.Arrays;

//2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

public class Chapter2_A2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortByLength(getRandomArray(10))));
	}

	private static int[] sortByLength(int[] array) {

		int[] lengthArray = getLengthArray(array);
		int tmp = 0;
		int tmpLength = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (lengthArray[i] > lengthArray[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					tmpLength = lengthArray[i];
					lengthArray[i] = lengthArray[j];
					lengthArray[j] = tmpLength;
				}
			}
		}

		return array;
	}

	private static int[] getLengthArray(int[] array) {
		int[] lengthArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			lengthArray[i] = String.valueOf(array[i]).length();
		}
		return lengthArray;
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
