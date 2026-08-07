package chapter4.chapter4A1;

import java.util.Objects;

public class Word {
	private final String value;
	private final PunctuationMark punctuationMark;

	public Word(String value, PunctuationMark punctuationMark) {
		this.value = Objects.requireNonNull(value);
		this.punctuationMark = Objects.requireNonNull(punctuationMark);
	}

	public String getValue() {
		return value;
	}

	public PunctuationMark getPunctuationMark() {
		return punctuationMark;
	}

	public boolean isCapitalized() {
		return !value.isEmpty() && Character.isUpperCase(value.charAt(0));
	}

	public String getText() {

		if (punctuationMark == PunctuationMark.NONE) {
			return value;
		}

		return value + punctuationMark.getCharacter();

	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (!(o instanceof Word word))
			return false;

		return Objects.equals(value, word.value) && punctuationMark == word.punctuationMark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, punctuationMark);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [value=" + value + ", punctuationMark=" + punctuationMark + "]";
	}
}
