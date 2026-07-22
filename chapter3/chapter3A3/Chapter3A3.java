package chapter3.chapter3A3;

import chapter3.TestDataCreator;
import chapter3.Patient;

/* 
  Создать массив объектов. Вывести:
	a) список пациентов, имеющих данный диагноз;
	b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */

public class Chapter3A3 {

	public static void main(String[] args) {
		Patient[] patients = TestDataCreator.createPatientArray();
//		print(patients);
		getPatientsByDiagnosis(patients, "Influenza");
		System.out.println();
		getPatientsByRecordNum(patients, 105, 108);

	}

//		список пациентов, имеющих данный диагноз
	public static void getPatientsByDiagnosis(Patient[] patients, String diagnosis) {
		for (Patient patient : patients) {
			if (patient.getDiagnosis().equals(diagnosis))
				System.out.println(patient);
		}

	}

//		список пациентов, номер медицинской карты которых находится в заданном интервале
	public static void getPatientsByRecordNum(Patient[] patients, int start, int end) {
		for (Patient patient : patients) {
			if (patient.getRecordNum() >= start && patient.getRecordNum() <= end)
				System.out.println(patient);
		}

	}
}
