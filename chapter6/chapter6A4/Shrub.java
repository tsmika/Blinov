package chapter6.chapter6A4;

public class Shrub extends Plant {

	private double bushHeight;

	Shrub(String name, String origin, double bushHeight) {
		super(name, origin);
		checkHeight(bushHeight);
		this.bushHeight = bushHeight;

	}

	public double getBushHeight() {
		return bushHeight;
	}

	public void setBushHeight(double bushHeight) {
		checkHeight(bushHeight);
		this.bushHeight = bushHeight;
	}

	public void prune(double height) {
		if (height <= 0) {
			throw new IllegalArgumentException("Height must be positive");
		}
		if (height >= bushHeight) {
			throw new IllegalArgumentException("Cannot prune " + height + " from height " + bushHeight);
		}
		bushHeight -= height;
		System.out.println("The bush was pruned to " + bushHeight);
	}

	private void checkHeight(double bushHeight) {
		if (bushHeight <= 0) {
			throw new IllegalArgumentException("Height must be positive");
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", bushHeight: " + bushHeight + "]";
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + Double.hashCode(bushHeight);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Shrub shrub))
			return false;
		if (!super.equals(o))
			return false;
		return Double.compare(bushHeight, shrub.bushHeight) == 0;
	}
}
