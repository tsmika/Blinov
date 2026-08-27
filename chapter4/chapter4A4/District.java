package chapter4.chapter4A4;

import java.util.Objects;

public class District {
	private String name;
	private City capital;
	private double area;

	public District() {

	}

	public District(String name, City capital, double area) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
		this.capital = Objects.requireNonNull(capital, "Capital cannot be null");
		setArea(area);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = Objects.requireNonNull(capital, "Capital cannot be null");
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		if (area <= 0) {
			throw new IllegalArgumentException("Area must be positive: " + area);
		}
		this.area = area;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + Objects.toString(name) + ", capital="
				+ Objects.toString(capital) + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, capital, area);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof District district))
			return false;

		return Objects.equals(name, district.name) && Objects.equals(capital, district.capital)
				&& Double.compare(area, district.area) == 0;
	}

}
