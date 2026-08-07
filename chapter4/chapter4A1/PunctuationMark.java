package chapter4.chapter4A1;

public enum PunctuationMark {
	NONE('\0'), SPACE(' '), PERIOD('.'), COMMA(','), QUESTION_MARK('?'), EXCLAMATION_MARK('!'), COLON(':'), SEMICOLON(';'), HYPHEN('-'),
	APOSTROPHE('\'');

	private final char character;

	// Конструктор, чтобы связать элемент enum с реальным символом
	PunctuationMark(char character) {
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}
}