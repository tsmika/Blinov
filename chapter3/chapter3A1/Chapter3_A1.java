package chapter3.chapter3A1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		Entity[] students = TestDataCreator.createData(EntityType.STUDENT);
//		System.out.println(Arrays.toString(students));
		getStudentsByDepartment(students);
//
	}

	private static void getStudentsByDepartment(Entity[] students) {
		List<String> departments = new ArrayList<String>();
		String department = "Mechanical Engineering";
		for (Entity student : students) {
			Student s = (Student) student;
			if (s.getDepartment().equals(department)) {
				System.out.println(s);
			}
		}
	}
}
