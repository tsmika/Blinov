package chapter3.chapter3B9;

import java.util.Random;

/*
	Определить класс Окружность на плоскости. Определить площадь и периметр. 
	Создать массив/список/множество объектов и определить группы окружностей,
	центры которых лежат на одной прямой.
	Определить наибольший и наименьший по площади (периметру) объект.
 */
public class Chapter3B9 {

	public static void main(String[] args) {
		int n = 5000;
		Circle[] circles = generateData(n);

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				boolean flag = true;

				for (int k = j + 1; k < n; k++) {
					if (areCollinear(circles[i], circles[j], circles[k])) {
						if (flag) {
							System.out.print("\ncollinears: " + "i = " + i + ", j = " + j);
							flag = false;
						} else {
							System.out.print("---------------------");
						}

						System.out.print(" : " + k + ", \n");
					}
				}
			}
		}
	}

	private static Circle[] generateData(int n) {

		Circle[] circles = new Circle[n];

		for (int i = 0; i < n; i++) {
			Random random = new Random();
			double x = random.nextDouble() * 100 - 50;
			double y = random.nextDouble() * 100 - 50;
			double radius = random.nextDouble() * 100 + 1;
			circles[i] = new Circle(x, y, radius);
		}

		return circles;
	}

	private static boolean areCollinear(Circle c1, Circle c2, Circle c3) {
		double x1 = c1.getX(), y1 = c1.getY();
		double x2 = c2.getX(), y2 = c2.getY();
		double x3 = c3.getX(), y3 = c3.getY();
		double determinant = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
		return Math.abs(determinant) < 1e-5;
	}

}
