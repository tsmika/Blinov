package chapter4.chapter4B3.model.impl;

import chapter4.chapter4B3.model.PlugInAppliance;

public class TV extends PlugInAppliance {
	private final double diagonal;

	public TV(String id, String name, double powerConsumption, double voltage, double diagonal) {
		super(id, name, powerConsumption, voltage);
		validateDiagonal(diagonal);
		this.diagonal = diagonal;
	}

	public double getDiagonal() {
		return diagonal;
	}

	private void validateDiagonal(double diagonal) {
		if (diagonal <= 0)
			throw new IllegalArgumentException("diagonal must be positive");
	}

	@Override
	public String getApplianceInfo() {
		return super.getApplianceInfo() + String.format(", %.1f cm", diagonal);
	}

	@Override
	public String toString() {
		return super.toString() + ", diagonal=" + diagonal + "]";
	}
}
