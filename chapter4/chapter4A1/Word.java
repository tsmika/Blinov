package chapter4.chapter4A1;

public class Word {
	private String value;
	private boolean isCapitalized;
	private PunctuationMark mark;

	public Word() {
		this.isCapitalized = false;
		this.mark = PunctuationMark.NONE;
	}

	public Word(String value, boolean isCapitalized, PunctuationMark mark) {
		this.value = value;
		this.isCapitalized = isCapitalized;
		this.mark = mark;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean getIsCapitalized() {
		return isCapitalized;
	}

	public void setIsCapitalized(boolean isCapitalized) {
		this.isCapitalized = isCapitalized;
	}

	public PunctuationMark getPunctuationMark() {
		return this.mark;
	}

	public PunctuationMark setPunctuationMark(PunctuationMark mark) {
		return this.mark = mark;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [value=" + value + ", isCapitalized=" + isCapitalized + ", mark=" + mark
				+ "]";
	}

}
