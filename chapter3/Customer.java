package chapter3;

public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String address;
	private String cardNum;
	private String accountNum;

	public Customer() {
	}

	public Customer(int id, String name, String address, String cardNum, String accountNum) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.cardNum = cardNum;
		this.accountNum = accountNum;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCardNum() {
		return cardNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", address=" + address + ", cardNum="
				+ cardNum + ", accountName=" + accountNum + "]";
	}

	@Override
	public int compareTo(Customer other) {
		return this.name.compareTo(other.name);
	}

}
