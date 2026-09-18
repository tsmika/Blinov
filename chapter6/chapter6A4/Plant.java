package chapter6.chapter6A4;

import java.util.Objects;

public abstract class Plant {
	private final String name;
	private final String origin;

	Plant(String name, String origin) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
		this.origin = Objects.requireNonNull(origin, "Origin cannot be null");
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", origin=" + origin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, origin);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Plant other))
			return false;
		if (getClass() != o.getClass())
			return false;
		return Objects.equals(name, other.name) && Objects.equals(origin, other.origin);
	}

}
