package chapter4.chapter4B3.model.impl;

import chapter4.chapter4B3.model.PlugInAppliance;

public class Refrigerator extends PlugInAppliance {
	private final double fridgeCapacity;

	public Refrigerator(String id, String name, double powerConsumption, double voltage, double fridgeCapacity) {
		super(id, name, powerConsumption, voltage);
		validateCapacity(fridgeCapacity);
		this.fridgeCapacity = fridgeCapacity;
	}

	public double getFridgeCapacity() {
		return fridgeCapacity;
	}

	private void validateCapacity(double capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("capacity must be positive");
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", fridgeCapacity=" + fridgeCapacity + "]";
	}

}
