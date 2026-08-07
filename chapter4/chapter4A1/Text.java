package chapter4.chapter4A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
	Создать объект класса Текст, используя классы Предложение, Слово.
	Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Text {

	private String title;
	private final List<Sentence> sentences = new ArrayList<>();

	public Text() {
		this.title = "";
	}

	public Text(String title) {
		this.title = Objects.requireNonNull(title, "Title must be not null!");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = Objects.requireNonNull(title, "Title must be not null!");
	}

	public String getText() {

		StringBuilder builder = new StringBuilder();

		builder.append("   ").append(title).append("\n");

		for (Sentence sentence : sentences) {
			builder.append(sentence.getText()).append("\n");
		}

		if (builder.length() > title.length() + 1) {
			builder.deleteCharAt(builder.length() - 1);
		}

		return builder.toString();
	}

	public void addSentence(Sentence sentence) {
		sentences.add(Objects.requireNonNull(sentence));
	}

	public void printText() {
		System.out.println(getText());
	}

	public void printTitle() {
		System.out.println(title);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(this instanceof Text text))
			return false;

		return Objects.equals(title, text.title) && Objects.equals(sentences, text.sentences);
	}

	public int hashCode() {
		return Objects.hash(title, sentences);
	}

	public String toString() {
		return getClass().getSimpleName() + " [title=" + title + ", sentences=" + sentences + "]";
	}
}
