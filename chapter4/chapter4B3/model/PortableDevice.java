package chapter4.chapter4B3.model;

public abstract class PortableDevice extends ElectricalAppliance {

	private final double capacity;

	public PortableDevice(String id, String name, double powerConsumption, double capacity) {
		super(id, name, powerConsumption);

		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be positive!");
		}

		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	@Override
	public String getApplianceInfo() {
		return super.getApplianceInfo() + String.format(", %.1f mAh", capacity);
	}

	@Override
	public String toString() {
		return super.toString() + ", capacity=" + capacity;
	}

}
