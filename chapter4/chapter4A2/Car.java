package chapter4.chapter4A2;

import java.util.Objects;

public class Car {
	private Make make;
	private Engine engine;
	private Wheel wheel;

	public Car() {

	}

	public Car(Make make, Engine engine, Wheel wheel) {
		this.make = Objects.requireNonNull(make);
		this.engine = Objects.requireNonNull(engine);
		this.wheel = Objects.requireNonNull(wheel);
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = Objects.requireNonNull(make, "Make must not be null.");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = Objects.requireNonNull(engine, "Engine must not be null.");
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = Objects.requireNonNull(wheel, "Wheel must not be null.");
	}

	public void go() {
		System.out.println("The car is going");
	}

	public void refuel() {
		System.out.println("The car is refueling");
	}

	public void changeWheel(Wheel wheel) {
		this.wheel = Objects.requireNonNull(wheel);
		System.out.println("Wheels have been changed");
	}

	public void printMake() {
		System.out.println("Make: " + make);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [make=" + Objects.toString(make) + ", engine=" + Objects.toString(engine)
				+ ", wheel=" + Objects.toString(wheel) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, engine, wheel);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Car car))
			return false;
		return Objects.equals(make, car.make) && Objects.equals(engine, car.engine) && Objects.equals(wheel, car.wheel);
	}

}
