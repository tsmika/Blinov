package chapter3.chapter3A1;

import java.util.ArrayList;
import java.util.Arrays;

import chapter3.Entity;
import chapter3.EntityType;
import chapter3.Student;
import chapter3.TestDataCreator;

/*
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы
 */
public class Chapter3_A1 {

	public static void main(String[] args) {
		Entity[] studentData = TestDataCreator.createData(EntityType.STUDENT);
		Student[] students = new Student[studentData.length];
		String departmentsData = "";
		String studyYearData = "";

		for (int i = 0; i < studentData.length; i++) {
			students[i] = (Student) studentData[i];
			String department = students[i].getDepartment();
			int studyYear = students[i].getStudyYear();

			if (!departmentsData.contains(department)) {
				departmentsData = departmentsData + department + ",";
			}

			if (!studyYearData.contains(String.valueOf(studyYear))) {
				studyYearData = studyYearData + studyYear + ",";
			}
		}

		String[] departments = departmentsData.split(",");
		String[] studyYears = studyYearData.split(",");
		Arrays.sort(studyYears);
		getStudentsByDepartment(students, "Mechanical Engineering");
		getStudentsByDepartmentAndYear(students, departments);
		getStudentsAfterYear(students, 2006);
		getStudentsByGroup(students, 2);
	}

	// список студентов заданного факультета;
	private static void getStudentsByDepartment(Student[] students, String department) {

		for (Student student : students) {
			if (student.getDepartment().equals(department)) {
				System.out.println(student);
			}
		}
	}

	// списки студентов для каждого факультета и курса;
	private static void getStudentsByDepartmentAndYear(Student[] students, String[] departments) {

		ArrayList<Student> firstYear = new ArrayList<Student>();
		ArrayList<Student> secondYear = new ArrayList<Student>();
		ArrayList<Student> thirdYear = new ArrayList<Student>();
		ArrayList<Student> fourthYear = new ArrayList<Student>();
		ArrayList<Student> fifthYear = new ArrayList<Student>();

		for (Student student : students) {
			int year = student.getStudyYear();

			switch (year) {
			case 1:
				firstYear.add(student);
				break;
			case 2:
				secondYear.add(student);
				break;
			case 3:
				thirdYear.add(student);
				break;
			case 4:
				fourthYear.add(student);
				break;
			case 5:
				fifthYear.add(student);
				break;
			}
		}

		Student[] firstYearArr = firstYear.toArray(new Student[0]);
		Student[] secondYearArr = secondYear.toArray(new Student[0]);
		Student[] thirdYearArr = thirdYear.toArray(new Student[0]);
		Student[] fourthYearArr = fourthYear.toArray(new Student[0]);
		Student[] fifthYearArr = fifthYear.toArray(new Student[0]);

		for (String department : departments) {

			System.out.println("\nDepartment: " + department);

			System.out.println("Study year: first");
			getStudentsByDepartment(firstYearArr, department);

			System.out.println("Study year: second");
			getStudentsByDepartment(secondYearArr, department);

			System.out.println("Study year: third");
			getStudentsByDepartment(thirdYearArr, department);

			System.out.println("Study year: fourth");
			getStudentsByDepartment(fourthYearArr, department);

			System.out.println("Study year: fifth");
			getStudentsByDepartment(fifthYearArr, department);
		}

	}

    //	список студентов, родившихся после заданного года
	private static void getStudentsAfterYear(Student[] students, int year) {
		for (Student student : students) {
			if (student.getDateOfBirth().getYear() > year) {
				System.out.println(student);
			}
		}
	}
    // список учебной группы
	private static void getStudentsByGroup(Student[] students, int group) {
		for (Student student : students) {
			if (student.getGroupNumber() == group) {
				System.out.println(student);
			}
		}
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//