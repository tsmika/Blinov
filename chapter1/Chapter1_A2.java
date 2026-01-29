package chapter1;

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class Chapter1_A2 {

	public static void main(String[] args) {

		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i]);
		}
	}
}


/*
D:\Soft\IDE Eclipse\Workspace\Blinov\src>java chapter1.Chapter1_A2 arg1 arg2 arg3
arg3
arg2
arg1
*/