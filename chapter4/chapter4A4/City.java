package chapter4.chapter4A4;

import java.util.Objects;

public class City {
	private String name;
	private Status status;

	public City() {

	}

	public City(String name, Status status) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
		this.status = Objects.requireNonNull(status, "Status cannot be null");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = Objects.requireNonNull(status, "Status cannot be null");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + Objects.toString(name) + ", status=" + Objects.toString(status)
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, status);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof City city))
			return false;
		return Objects.equals(name, city.name) && Objects.equals(status, city.status);
	}

}
