package chapter4.chapter4B3.model;

public abstract class PlugInAppliance extends ElectricalAppliance {
	private final double voltage;

	public PlugInAppliance() {
		super();
		this.voltage = 0.001;
	}

	public PlugInAppliance(String id, String name, double powerConsumption, double voltage) {
		super(id, name, powerConsumption);

		if (voltage <= 0) {
			throw new IllegalArgumentException("Voltage must be positive!");
		}

		this.voltage = voltage;
	}

	public double getVoltage() {
		return voltage;
	}

	@Override
	public String getApplianceInfo() {
		return super.getApplianceInfo() + String.format(", %.1f V", voltage);
	}

	@Override
	public String toString() {
		return super.toString() + ", voltage=" + voltage;
	}
}
