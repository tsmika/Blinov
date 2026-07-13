package chapter3;

public class Patient extends Entity{
	private String name;
	private String address;
	private String phone;
	private int recordNum;
	private String diagnosis;

	public Patient(){
	}

	public Patient(String name, String address, String phone, int recordNum, String diagnosis) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.recordNum = recordNum;
		this.diagnosis = diagnosis;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public int getRecordNum() {
		return recordNum;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRecordNum(int recordNum) {
		this.recordNum = recordNum;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", address=" + address + ", phone=" + phone
				+ ", recordNum=" + recordNum + ", diagnosis=" + diagnosis + "]";
	}
}
