package chapter5.chapter5A15;

/*
 Создать класс Computer с внутренним классом, с помощью объектов которого можно хранить
 информацию об операционной системе, процессоре и оперативной памяти.
 */
public class Chapter5A15 {

	public static void main(String[] args) {

		Computer computer = new Computer("1");
		computer.getConfig().setOs("Windows10");
		computer.getConfig().setProcessor("Intel 5 GHz");
		computer.getConfig().setRam("16 Gb");

		computer.printConfiguration();
	}

}
