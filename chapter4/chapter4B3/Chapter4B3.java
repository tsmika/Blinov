package chapter4.chapter4B3;
/*
 Создать консольное приложение, удовлетворяющее следующим требованиям:
• Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении
  кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения параметров инициализации можно использовать файлы.

3. Домашние электроприборы. Определить иерархию электроприборов.
   Включить некоторые в розетку. Подсчитать потребляемую мощность. Провести сортировку приборов в квартире на основе мощности. Найти прибор
   в квартире, соответствующий заданному диапазону параметров.

Иерархия:
   ElectricalAppliance (абстрактный)
├── PlugInAppliance (включаемые в розетку)
│   ├── Refrigerator
│   └── TV
└── PortableDevice (портативные, с аккумулятором)
    ├── Smartphone
    └── Laptop
Пакеты:
src/
├── model/
│   └── impl/
├── service/
│   └── ApartmentManager.java
└── Main.java
*/

import java.util.ArrayList;
import java.util.List;

import chapter4.chapter4B3.model.ElectricalAppliance;
import chapter4.chapter4B3.model.impl.Laptop;
import chapter4.chapter4B3.model.impl.Refrigerator;
import chapter4.chapter4B3.model.impl.Smartphone;
import chapter4.chapter4B3.model.impl.TV;
import chapter4.chapter4B3.service.ApartmentManager;

public class Chapter4B3 {
	public static void main(String[] args) {
		List<ElectricalAppliance> appliances = getTestData();
		ApartmentManager manager = new ApartmentManager(appliances);
		manager.print(appliances);
		manager.getCurrentPowerConsumption();

		appliances.get(0).plugIn();
		appliances.get(2).plugIn();
		appliances.get(3).plugIn();
		appliances.get(7).plugIn();

		manager.print(appliances);
		manager.getCurrentPowerConsumption();

		manager.sortByPowerConsumption();
		manager.print(appliances);

		manager.print(manager.getAppliancesByParameters(80, 90, true, "[a-zA-Z0-9 ]+"));
	}

	private static List<ElectricalAppliance> getTestData() {
		List<ElectricalAppliance> appliances = new ArrayList<>();

		// 2 ноутбука (Laptop)
		appliances.add(new Laptop("LAP-001", "MacBook Pro", 85.0, 7500.0, 2.1));
		appliances.add(new Laptop("LAP-002", "Dell XPS 13", 65.0, 6000.0, 1.8));

		// 5 смартфонов (Smartphone)
		appliances.add(new Smartphone("PHN-001", "iPhone 15 Pro", 12.0, 4500.0, 6.1));
		appliances.add(new Smartphone("PHN-002", "Samsung Galaxy S24", 15.0, 5000.0, 6.8));
		appliances.add(new Smartphone("PHN-003", "Google Pixel 8", 10.0, 4200.0, 6.2));
		appliances.add(new Smartphone("PHN-004", "OnePlus 12", 14.0, 4800.0, 6.7));
		appliances.add(new Smartphone("PHN-005", "Xiaomi 14 Pro", 13.0, 4600.0, 6.5));

		// 2 холодильника (Refrigerator)
		appliances.add(new Refrigerator("FRG-001", "Samsung Side-by-Side", 150.0, 220.0, 600.0));
		appliances.add(new Refrigerator("FRG-002", "LG French Door", 180.0, 220.0, 680.0));

		// 3 телевизора (TV)
		appliances.add(new TV("TV-001", "Samsung QLED 4K", 120.0, 220.0, 139.0));
		appliances.add(new TV("TV-002", "LG OLED 4K", 110.0, 220.0, 165.0));
		appliances.add(new TV("TV-003", "Sony BRAVIA 4K", 130.0, 220.0, 152.0));

		return appliances;
	}
}
