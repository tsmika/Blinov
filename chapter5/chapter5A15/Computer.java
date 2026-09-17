package chapter5.chapter5A15;

public class Computer {
	private final String id;
	private final Configuration config = new Configuration();

	public Computer(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Configuration getConfig() {
		return config;
	}

	public void printConfiguration() {
		System.out.println(
				"Operating system: " + config.os + ", processor: " + config.processor + ", RAM: " + config.ram);
	}

	public class Configuration {
		private String os;
		private String processor;
		private String ram;

		public String getOs() {
			return os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getProcessor() {
			return processor;
		}

		public void setProcessor(String processor) {
			this.processor = processor;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}
	}
}
