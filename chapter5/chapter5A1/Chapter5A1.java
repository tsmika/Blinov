package chapter5.chapter5A1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import chapter5.chapter5A1.Notepad.Note;

/*
Создать класс Notepad с внутренним классом или классами, с помощью
объектов которого могут храниться несколько записей на одну дату.
 */

public class Chapter5A1 {

	public static void main(String[] args) {
		Notepad notepad = getTestData();
		System.out.println(notepad.getAllNotes());
	}

	private static Notepad getTestData() {

		List<Note> notes = new ArrayList<>();
		Notepad notepad = new Notepad(notes);
		List<String> records1 = new ArrayList<>();
		List<String> records2 = new ArrayList<>();
		List<String> records3 = new ArrayList<>();

		records1.add("Позвонить клиенту1");
		records1.add("Отправить отчет1");
		records1.add("Проверить сервер1");
		Notepad.Note note1 = notepad.new Note(records1, LocalDate.of(2026, 2, 8));

		records2.add("Позвонить клиенту2");
		records2.add("Отправить отчет2");
		records2.add("Проверить сервер2");
		Note note2 = notepad.new Note(records2, LocalDate.of(2026, 7, 15));

		records3.add("Позвонить клиенту3");
		records3.add("Отправить отчет3");
		records3.add("Проверить сервер3");
		Note note3 = notepad.new Note(records3, LocalDate.now());

		notes.add(note1);
		notes.add(note2);
		notes.add(note3);

		return notepad;
	}

}
