package chapter4.chapter4B3.model.impl;

import chapter4.chapter4B3.model.PortableDevice;

public class Laptop extends PortableDevice {

	private final double weight;

	public Laptop(String id, String name, double powerConsumption, double capacity, double weight) {
		super(id, name, powerConsumption, capacity);
		if (weight <= 0)
			throw new IllegalArgumentException("weight must be positive");
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String getApplianceInfo() {
		return super.getApplianceInfo() + String.format(", %.1f kg", weight);
	}

	@Override
	public String toString() {
		return super.toString() + ", weight=" + weight + "]";
	}
}
