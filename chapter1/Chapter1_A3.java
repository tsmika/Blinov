package chapter1;

import java.util.Scanner;

// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.

public class Chapter1_A3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		do {
			System.out.print("Input random number (number > 6: ");
			n = scanner.nextInt();
		} while (n < 7);

		scanner.close();
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println(Math.random());
			} else {
				System.out.print(Math.random() + " ");
			}
		}
	}
}
