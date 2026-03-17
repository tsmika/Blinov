package chapter2;
// 9. Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.

//  ax^2 + bx + c = 0, Дискриминант: D = b^2 - 4ac, Формула корней: x_{1,2} = (-b +- sqrt{D}}) / 2a

public class Chapter2_A9 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int d = b * b - 4 * a * c;

		if (d < 0) {
			System.out.println("No solution.");
			return;
		}

		double x1 = (-b + Math.sqrt(d)) / (2 * a);
		double x2 = (-b - Math.sqrt(d)) / (2 * a);

		System.out.println("x1 = " + x1 + ", x2 = " + x2);

	}

}

// D:\Soft\IDE Eclipse\Workspace\Blinov\src\chapter2>javac Chapter2_A9.java
// D:\Soft\IDE Eclipse\Workspace\Blinov\src>java chapter2.Chapter2_A9 1 2 3