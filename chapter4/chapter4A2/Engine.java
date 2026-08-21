package chapter4.chapter4A2;

import java.util.Objects;

public class Engine {
	private double power;
	private double displacement;

	public Engine() {

	}

	public Engine(double power, double displacement) {
		this.power = power;
		this.displacement = displacement;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getDisplacement() {
		return displacement;
	}

	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Engine engine))
			return false;
		return Double.compare(power, engine.power) == 0 && Double.compare(displacement, engine.displacement) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(power, displacement);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [power=" + power + ", displacement=" + displacement + "]";
	}

}
