package chapter2;
// 3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также их длину.

import java.util.Arrays;

public class Chapter2_A3 {
    public static void main(String[] args) {
        printNumbersWithLengthAboveAndBelowAverage();
    }

    private static void printNumbersWithLengthAboveAndBelowAverage() {
        int[] array = getRandomArray(10);
        int[] lengthArray = getLengthArray(array);
        double average = getAverage(lengthArray);
        System.out.println("Average length = " + average);

        System.out.println("\nElements with length below average:");
        for (int i = 0; i < lengthArray.length; i++) {
            if (lengthArray[i] < average)
                System.out.println("Element " + array[i] + ", length = " + lengthArray[i]);
        }

        System.out.println("\nElements with length above average:");
        for (int i = 0; i < lengthArray.length; i++) {
            if (lengthArray[i] > average)
                System.out.println("Element " + array[i] + ", length = " + lengthArray[i]);
        }
    }

    private static double getAverage(int[] array) {
        int sum = 0;

        for (int item : array) {
            sum = sum + item;
        }

        return (double) sum / array.length;
    }

    private static int[] getLengthArray(int[] array) {
        int[] lengthArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            lengthArray[i] = String.valueOf(Math.abs(array[i])).length();
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
