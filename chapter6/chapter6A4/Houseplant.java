package chapter6.chapter6A4;

public class Houseplant extends Plant {

	private final double potCapacity;

	Houseplant(String name, String origin, double potCapacity) {
		super(name, origin);
		checkCapacity(potCapacity);
		this.potCapacity = potCapacity;
	}

	public void repot() {
		System.out.println("The houseplant was repotted.");
	}

	private static void checkCapacity(double potCapacity) {
		if (potCapacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive");
		}
	}

	public double getPotCapacity() {
		return potCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + ", potCapacity=" + potCapacity + "]";
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + Double.hashCode(potCapacity);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Houseplant houseplant))
			return false;
		if (!super.equals(o))
			return false;
		return Double.compare(potCapacity, houseplant.potCapacity) == 0;
	}
}
