package chapter4.chapter4B3.model.impl;

import chapter4.chapter4B3.model.PortableDevice;

public class Smartphone extends PortableDevice {
	private final double screenSize;

	public Smartphone(String id, String name, double powerConsumption, double capacity, double screenSize) {
		super(id, name, powerConsumption, capacity);
		if (screenSize <= 0)
			throw new IllegalArgumentException("screenSize must be positive");
		this.screenSize = screenSize;
	}

	public double getScreenSize() {
		return screenSize;
	}

	@Override
	public String getApplianceInfo() {
		return super.getApplianceInfo() + String.format(", %.1f inch", screenSize);
	}

	@Override
	public String toString() {
		return super.toString() + ", screenSize=" + screenSize + "]";
	}
}
