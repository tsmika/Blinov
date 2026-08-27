package chapter4.chapter4A4;

import java.util.List;
import java.util.Objects;

public class State {
	private String name;
	private City capital;
	private List<Province> provinces;

	public State() {
	}

	public State(String name, City capital, List<Province> provinces) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
		this.capital = Objects.requireNonNull(capital, "Capital can't be null");
		this.provinces = Objects.requireNonNull(provinces, "Provinces can't be null");
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
		this.capital = Objects.requireNonNull(capital, "Capital can't be null");
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = Objects.requireNonNull(provinces, "Provinces can't be null");
	}

	public double getArea() {

		if (provinces == null) {
			return 0.0;
		}

		double area = 0.0;

		for (Province item : provinces) {
			area = area + item.getArea();
		}

		return area;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + Objects.toString(name) + ", capital="
				+ Objects.toString(capital) + ", provinces=" + Objects.toString(provinces) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, capital, provinces);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof State state))
			return false;
		return Objects.equals(name, state.name) && Objects.equals(capital, state.capital)
				&& Objects.equals(provinces, state.provinces);
	}
}
