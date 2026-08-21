package chapter4.chapter4A2;

import java.util.Objects;

public class Wheel {
	private double width;
	private double diameter;
	private FlangeType flangeType;

	public Wheel() {
		this(0.0, 0.0, FlangeType.J);
	}

	public Wheel(double width, double diameter, FlangeType flangeType) {
		this.width = width;
		this.diameter = diameter;
		this.flangeType = Objects.requireNonNull(flangeType);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public FlangeType getFlangeType() {
		return flangeType;
	}

	public void setFlangeType(FlangeType flangeType) {
		this.flangeType = Objects.requireNonNull(flangeType, "FlangeType cannot be null");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Wheel wheel))
			return false;
		return Double.compare(width, wheel.width) == 0 && Double.compare(diameter, wheel.diameter) == 0
				&& Objects.equals(flangeType, wheel.flangeType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(width, diameter, flangeType);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [width=" + width + ", diameter=" + diameter + ", "
				+ Objects.toString(flangeType) + "]";
	}
}
