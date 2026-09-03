package chapter4.chapter4B3.model;

import java.util.Objects;

public abstract class ElectricalAppliance {
	private String id;
	private String name;
	private final double powerConsumption;
	private boolean isPlugged;

	protected ElectricalAppliance() {
		this("0", "Unknown", 0.0001);
	}

	public ElectricalAppliance(String id, String name, double powerConsumption) {
		this.id = Objects.requireNonNull(id, "Id cannot be null!");
		this.name = Objects.requireNonNull(name, "Name cannot be null!");

		if (powerConsumption > 0) {
			this.powerConsumption = powerConsumption;
		} else {
			throw new IllegalArgumentException("powerConsumption cannot be negative or zero");
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = Objects.requireNonNull(id, "Id cannot be null!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name cannot be null!");
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public boolean isPlugged() {
		return isPlugged;
	}

	public void plugIn() {
		this.isPlugged = true;
		System.out.println(name + " " + "(" + id + ")" + " подключен к сети");
	}

	public void unplug() {
		this.isPlugged = false;
		System.out.println(name + " " + "(" + id + ")" + " отключен от сети");
	}

	public String getApplianceInfo() {
		return String.format("%s %s (%.1f W) %s", id, name, powerConsumption, isPlugged ? "PLUGGED" : "UNPLUGGED");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + Objects.toString(id) + ", name=" + Objects.toString(name)
				+ ", powerConsumption=" + powerConsumption + ", isPlugged=" + isPlugged;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ElectricalAppliance electricalAppliance))
			return false;
		if (getClass() != electricalAppliance.getClass())
			return false;
		return Objects.equals(id, electricalAppliance.id);
	}

}
