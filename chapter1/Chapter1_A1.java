package chapter1;

import java.util.Scanner;

// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class Chapter1_A1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input your name:");
		String name = scanner.nextLine();
		System.out.println("Hello, " + name + "!");
		scanner.close();
	}

}
