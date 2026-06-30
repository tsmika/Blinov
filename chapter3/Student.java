package chapter3;

import java.time.LocalDate;

/*
 Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
 Факультет, Курс, Группа.
 */

import java.util.Date;

public class Student extends Entity {
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private String address;
	private String phone;
	private String department;
	private int studyYear;
	private int groupNumber;

	public Student() {
	}

	public Student(int id, String name, LocalDate dateOfBirth, String address, String phone, String department,
			int studyYear, int groupNumber) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
		this.department = department;
		this.studyYear = studyYear;
		this.groupNumber = groupNumber;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		// new Student(3,"John Smith", LocalDate.of(2009, 5, 8), "New Delhi",
		// "125-14-18", "School of Engineering and Applied Sciences", 2, 12);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id= " + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", address=" + address + ", phone=" + phone + ", department=" + department + ", studyYear= "
				+ studyYear + ", groupNumber=" + groupNumber + "]";
	}

}