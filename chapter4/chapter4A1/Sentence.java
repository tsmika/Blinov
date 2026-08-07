package chapter4.chapter4A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Sentence {
	private final List<Word> words;

	public Sentence() {
		this.words = new ArrayList<>();
	}

	public Sentence(List<Word> words) {
		this.words = new ArrayList<>(Objects.requireNonNull(words, "Words must not be null!"));
	}

	public List<Word> getWords() {
		return Collections.unmodifiableList(words);
	}

	public void addWord(Word word) {
		words.add(Objects.requireNonNull(word));
	}

	public String getText() {
		StringBuilder text = new StringBuilder();

		for (Word word : words) {
			text.append(word.getText()).append(" ");
		}

		if (text.length() > 0) {
			text.deleteCharAt(text.length() - 1);
		}

		return text.toString();
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (!(o instanceof Sentence sentence))
			return false;

		return Objects.equals(words, sentence.words);
	}

	@Override
	public int hashCode() {
		return Objects.hash(words);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + words;
	}

}
