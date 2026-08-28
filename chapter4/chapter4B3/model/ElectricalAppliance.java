package chapter4.chapter4B3.model;

import java.util.Objects;

public abstract class ElectricalAppliance {
	private String name;
	private final double powerConsumption;
	private boolean isPlugged;

	public ElectricalAppliance() {
		this("Unknown", 0.0001);
	}

	public ElectricalAppliance(String name, double powerConsumption) {
		this.name = Objects.requireNonNull(name, "Name cannot be null!");

		if (powerConsumption > 0) {
			this.powerConsumption = powerConsumption;
		} else {
			throw new IllegalArgumentException("powerConsumption cannot be negative or zero");
		}
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

	// Подключаем к розетке
	public void plugIn() {
		this.isPlugged = true;
		System.out.println(name + " подключен к сети");
	}

	// Выключаем из розетки
	public void unplug() {
		this.isPlugged = false;
		System.out.println(name + " отключен от сети");
	}

	public String getApplianceInfo() {
		return String.format("%s (%.1f W) %s", name, powerConsumption, isPlugged ? "PLUGGED" : "UNPLUGGED");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + Objects.toString(name) + ", powerConsumption="
				+ powerConsumption + ", isPlugged=" + isPlugged;
	}

}
