package chapter4.chapter4A4;

import java.util.List;

/*
Создать объект класса Государство, используя классы Область, Район,
Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
*/
public class chapter4A4 {

	public static void main(String[] args) {

		State belarus = getTestData();

		System.out.println(belarus.getCapital().getName() + " is the capital of " + belarus.getName());
		System.out.println(belarus.getName() + " has " + belarus.getProvinces().size() + " provinces.");
		System.out.println("Area of " + belarus.getName() + " is " + belarus.getArea() + " square km");
		System.out.println();

		for (Province item : belarus.getProvinces()) {
			System.out.println(item.getCapital().getName() + " is the capital of " + item.getName());
		}

	}

	private static State getTestData() {
		// Города
		City minsk = new City("Minsk", Status.CAPITAL);
		City brest = new City("Brest", Status.REGIONAL);
		City vitebsk = new City("Vicebsk", Status.REGIONAL);
		City gomel = new City("Homel", Status.REGIONAL);
		City grodno = new City("Grodno", Status.REGIONAL);
		City mogilev = new City("Mahileu", Status.REGIONAL);

		// Области как районы (с полной площадью области)
		District brestRegion = new District("Brest Region", brest, 32787.0);
		District vitebskRegion = new District("Vicebsk Region", vitebsk, 40051.0);
		District gomelRegion = new District("Homel Region", gomel, 40372.0);
		District grodnoRegion = new District("Grodno Region", grodno, 25268.0);
		District mogilevRegion = new District("Magileu Region", mogilev, 29068.0);
		District minskRegion = new District("Minsk Region", minsk, 39854.0);

		// Провинции (каждая с одним районом)
		Province brestProvince = new Province("Bresckaja voblast'", brest, List.of(brestRegion));
		Province vitebskProvince = new Province("Vicebskaja voblast'", vitebsk, List.of(vitebskRegion));
		Province gomelProvince = new Province("Homelkaja voblast'", gomel, List.of(gomelRegion));
		Province grodnoProvince = new Province("Grodnenskaja voblast'", grodno, List.of(grodnoRegion));
		Province mogilevProvince = new Province("Mahileuskaja voblast'", mogilev, List.of(mogilevRegion));
		Province minskProvince = new Province("Minskskaja voblast'", minsk, List.of(minskRegion));

		// Государство
		List<Province> provinces = List.of(brestProvince, vitebskProvince, gomelProvince, grodnoProvince,
				mogilevProvince, minskProvince);

		return new State("Belarus", minsk, provinces);
	}
}
