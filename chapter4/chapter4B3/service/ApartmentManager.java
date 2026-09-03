package chapter4.chapter4B3.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

import chapter4.chapter4B3.model.ElectricalAppliance;
/*
 Включить некоторые в розетку.
 Подсчитать потребляемую мощность.
 Провести сортировку приборов в квартире на основе мощности.
 Найти прибор в квартире, соответствующий заданному диапазону параметров.
*/

public class ApartmentManager {
	private final List<ElectricalAppliance> appliances;

	public ApartmentManager(List<ElectricalAppliance> appliances) {
		this.appliances = appliances;
	}

	public List<ElectricalAppliance> getAppliances() {
		return appliances;
	}

	public void plugInAppliance(ElectricalAppliance appliance) {
		appliance.plugIn();
	}

	public double getCurrentPowerConsumption() {

		double currentPowerConsumption = 0.0;

		for (ElectricalAppliance appliance : appliances) {
			if (appliance.isPlugged())
				currentPowerConsumption = +appliance.getPowerConsumption();
		}

		System.out.println("Current power consumption: " + currentPowerConsumption);
		return currentPowerConsumption;
	}

	public void sortByPowerConsumption() {
		Collections.sort(appliances, new Comparator<ElectricalAppliance>() {
			@Override
			public int compare(ElectricalAppliance appliance1, ElectricalAppliance appliance2) {
				return Double.compare(appliance1.getPowerConsumption(), appliance2.getPowerConsumption());
			}
		});
	}

	public List<ElectricalAppliance> getAppliancesByParameters(double powerConsumptionFrom, double powerConsumptionTo,
			boolean isPlagged, String nameRegEx) {

		List<ElectricalAppliance> pickedAppliances = new ArrayList<>();

		for (ElectricalAppliance appliance : appliances) {
			if (appliance.getPowerConsumption() >= powerConsumptionFrom
					&& appliance.getPowerConsumption() < powerConsumptionTo && appliance.isPlugged() == isPlagged
					&& Pattern.matches(nameRegEx, appliance.getName()))
				pickedAppliances.add(appliance);
		}

		return pickedAppliances;
	}

	public void print(List<ElectricalAppliance> appliances) {
		System.out.println("\n"); 
		for (ElectricalAppliance appliance : appliances) {
			System.out.println(appliance.getApplianceInfo());
		}
	}
}
