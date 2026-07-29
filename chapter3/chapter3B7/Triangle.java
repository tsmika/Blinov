package chapter3.chapter3B7;

public class Triangle {
	private int x;
	private int y;
	private int z;

	public Triangle() {
	}

	public Triangle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getSquare() {
		double p = (x + y + z) / 2;
		return Math.sqrt(p * (p - x) * (p - y) * (p - z));
	}

	public double getPerimeter() {
		return x + y + z;
	}

//	Equilateral [ˌiːkwɪˈlætərəl] — равносторонний.
	public boolean isEquilateral() {
		return (x == y && y == z);
	}

//	Isosceles [aɪˈsɒsəliːz] — равнобедренный.
	public boolean isIsosceles() {
		return (x == y || y == z || z == x) && !isEquilateral();
	}

//  Right-angled — прямоугольный.
	public boolean isRight() {
		return x * x + z * z == y * y || x * x + y * y == z * z || y * y + z * z == x * x;
	}

//	Scalene [skeɪˈliːn] — произвольный (разносторонний).
	public boolean isScalene() {
		return x != y && x != z && y != z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
