package chapter6.chapter6A4;

import java.util.Objects;

public class Flowering extends Plant {
	private final String color;

	Flowering(String name, String origin, String color) {
		super(name, origin);
		this.color = Objects.requireNonNull(color, "Color cannot be null");
	}

	public void cutFlowers() {
		System.out.println("Flowers were cut.");
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + color.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Flowering flowering))
			return false;
		if (!super.equals(o))
			return false;

		return Objects.equals(color, flowering.color);
	}

}
