package chapter4.chapter4A4;

import java.util.List;
import java.util.Objects;

public class Province {
	private String name;
	private City capital;
	private List<District> districts;

	public Province() {

	}

	public Province(String name, City capital, List<District> districts) {
		this.name = Objects.requireNonNull(name, "Name can't be null");
		this.capital = Objects.requireNonNull(capital, "Capital can't be null");
		this.districts = Objects.requireNonNull(districts, "Districts can't be null");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name can't be null");
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = Objects.requireNonNull(capital, "Capital can't be null");
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = Objects.requireNonNull(districts, "Districts can't be null");
	}

	public double getArea() {

		if (districts == null) {
			return 0.0;
		}

		double area = 0;

		for (District item : districts) {
			area = area + item.getArea();
		}

		return area;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + Objects.toString(name) + ", capital="
				+ Objects.toString(capital) + ", districts=" + Objects.toString(districts) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, capital, districts);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Province province))
			return false;
		return Objects.equals(name, province.name) && Objects.equals(capital, province.capital)
				&& Objects.equals(districts, province.districts);
	}
}
