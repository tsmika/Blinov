package chapter1;

import java.util.Scanner;

// 4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

public class Chapter1_A4 {

	public static void main(String[] args) {
		String sample = "password";
		String password;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter password: ");
		password = scanner.nextLine();
		
		if(password.equals(sample)) {
			System.out.println("Password is correct.");
		} else {
			System.out.println("Password is incorrect.");
		}
		
	}

}
