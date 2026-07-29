package chapter3.chapter3B7;

/* Определить класс Треугольник на плоскости. Определить площадь и периметр треугольника.
	Создать массив/список/множество объектов и подсчитать количество треугольников
	разного типа (равносторонний, равнобедренный, прямоугольный, произвольный). 
	Определить для каждой группы наибольший и наименьший по площади (периметру) объект
*/

public class chapter3B7 {

	public static void main(String[] args) {
		int n = 10000;
		Triangle[] triangles = generateData(n);

		int equilateralCount = 0;
		double equilateralMaxSquare = 0;
		int equilateralMaxSquareIndex = 0;

		int isoscelesCount = 0;
		double isoscelesMaxSquare = 0;
		int isoscelesMaxSquareIndex = 0;

		int rightCount = 0;
		double rightMaxSquare = 0;
		int rightMaxSquareIndex = 0;

		int scaleneCount = 0;
		double scaleneMaxSquare = 0;
		int scaleneMaxSquareIndex = 0;

		for (int i = 0; i < n; i++) {

			if (triangles[i].isEquilateral()) {
				equilateralCount++;

				if (triangles[i].getSquare() > equilateralMaxSquare) {
					equilateralMaxSquare = triangles[i].getSquare();
					equilateralMaxSquareIndex = i;
				}
			}

			if (triangles[i].isIsosceles()) {
				isoscelesCount++;
				if (triangles[i].getSquare() > isoscelesMaxSquare) {
					isoscelesMaxSquare = triangles[i].getSquare();
					isoscelesMaxSquareIndex = i;
				}
			}

			if (triangles[i].isRight()) {
				rightCount++;
				if (triangles[i].getSquare() > rightMaxSquare) {
					rightMaxSquare = triangles[i].getSquare();
					rightMaxSquareIndex = i;
				}
			}

			if (triangles[i].isScalene()) {
				scaleneCount++;
				if (triangles[i].getSquare() > scaleneMaxSquare) {
					scaleneMaxSquare = triangles[i].getSquare();
					scaleneMaxSquareIndex = i;
				}
			}
		}

		System.out.println("equilateral : " + equilateralCount);
		System.out.println("equilateral max square (" + equilateralMaxSquareIndex + ") :" + equilateralMaxSquare);
		System.out.println("isosceles : " + isoscelesCount);
		System.out.println("isosceles max square (" + isoscelesMaxSquareIndex + ") :" + isoscelesMaxSquare);
		System.out.println("right : " + rightCount);
		System.out.println("right max square (" + rightMaxSquareIndex + ") :" + rightMaxSquare);
		System.out.println("scalene: " + scaleneCount);
		System.out.println("scalene max square (" + scaleneMaxSquareIndex + ") :" + scaleneMaxSquare);

	}

	private static Triangle[] generateData(int n) {

		Triangle[] triangles = new Triangle[n];

		int i = 0;
		while (i < n) {

			int x = (int) (Math.random() * 100) + 1;
			int y = (int) (Math.random() * 100) + 1;
			int z = (int) (Math.random() * 100) + 1;

			if (canFormTriangle(x, y, z)) {
				triangles[i] = new Triangle(x, y, z);
				i++;
			}
		}

		return triangles;
	}

	private static boolean canFormTriangle(double x, double y, double z) {
		return (x + y) > z && (x + z) > y && (y + z) > x;
	}

}
