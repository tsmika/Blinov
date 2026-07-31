package chapter3.chapter3B9;

public class Circle {
	private double x;
	private double y;
	private double radius;

	public Circle() {
		this(0, 0, 1);
	}

	public Circle(double x, double y, double radius) {

		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive");
		}

		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {

		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive");
		}

		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

}
