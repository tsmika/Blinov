package chapter4.chapter4A2;

/*
 Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

public class Chapter4A2 {

	public static void main(String[] args) {
		Car car = new Car(Make.SKODA, new Engine(80.0, 2.5), new Wheel(0.2, 0.8, FlangeType.JJ));
		car.go();
		car.refuel();
		car.changeWheel(new Wheel(0.3, 0.9, FlangeType.J));
		car.printMake();
	}
}
