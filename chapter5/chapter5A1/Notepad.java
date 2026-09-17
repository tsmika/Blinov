package chapter5.chapter5A1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notepad {

	private final List<Note> notes;

	public Notepad(List<Note> notes) {
		this.notes = notes;
	}

	public void addNote(Note note) {
		notes.add(note);
	}

	public String getAllNotes() {

		StringBuilder builder = new StringBuilder();

		for (Note note : notes) {
			builder.append(note.date.toString()).append(" :\n");
			for (String item : note.records) {
				builder.append(item + "\n");
			}
		}

		return builder.toString();
	}

	public class Note {
		private final LocalDate date;
		private final List<String> records;

		public Note(List<String> records, LocalDate date) {
			this.date = date;
			this.records = new ArrayList<>(records);
		}
	}
}
