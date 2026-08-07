package chapter4.chapter4A1;

public class chapter4A1 {

	public static void main(String[] args) {

		Text text = createText();
		text.printText();

	}

	public static Text createText() {

		Text text = new Text("\u001B[34m" + "Pride and Prejudice" + "\u001B[0m");

		// Sentence 1
		Sentence s1 = new Sentence();
		s1.addWord(new Word("It", PunctuationMark.SPACE));
		s1.addWord(new Word("was", PunctuationMark.SPACE));
		s1.addWord(new Word("a", PunctuationMark.SPACE));
		s1.addWord(new Word("quiet", PunctuationMark.SPACE));
		s1.addWord(new Word("morning", PunctuationMark.PERIOD));

		// Sentence 2
		Sentence s2 = new Sentence();
		s2.addWord(new Word("The", PunctuationMark.SPACE));
		s2.addWord(new Word("young", PunctuationMark.SPACE));
		s2.addWord(new Word("lady", PunctuationMark.SPACE));
		s2.addWord(new Word("walked", PunctuationMark.SPACE));
		s2.addWord(new Word("through", PunctuationMark.SPACE));
		s2.addWord(new Word("the", PunctuationMark.SPACE));
		s2.addWord(new Word("garden", PunctuationMark.COMMA));

		// Sentence 3
		Sentence s3 = new Sentence();
		s3.addWord(new Word("she", PunctuationMark.SPACE));
		s3.addWord(new Word("thought", PunctuationMark.SPACE));
		s3.addWord(new Word("about", PunctuationMark.SPACE));
		s3.addWord(new Word("love", PunctuationMark.SPACE));
		s3.addWord(new Word("and", PunctuationMark.SPACE));
		s3.addWord(new Word("honour", PunctuationMark.PERIOD));

		// Sentence 4
		Sentence s4 = new Sentence();
		s4.addWord(new Word("The", PunctuationMark.SPACE));
		s4.addWord(new Word("old", PunctuationMark.SPACE));
		s4.addWord(new Word("house", PunctuationMark.SPACE));
		s4.addWord(new Word("stood", PunctuationMark.SPACE));
		s4.addWord(new Word("near", PunctuationMark.SPACE));
		s4.addWord(new Word("the", PunctuationMark.SPACE));
		s4.addWord(new Word("river", PunctuationMark.PERIOD));

		// Sentence 5
		Sentence s5 = new Sentence();
		s5.addWord(new Word("Many", PunctuationMark.SPACE));
		s5.addWord(new Word("people", PunctuationMark.SPACE));
		s5.addWord(new Word("believed", PunctuationMark.SPACE));
		s5.addWord(new Word("that", PunctuationMark.SPACE));
		s5.addWord(new Word("fortune", PunctuationMark.SPACE));
		s5.addWord(new Word("could", PunctuationMark.SPACE));
		s5.addWord(new Word("change", PunctuationMark.PERIOD));

		// Sentence 6
		Sentence s6 = new Sentence();
		s6.addWord(new Word("But", PunctuationMark.SPACE));
		s6.addWord(new Word("true", PunctuationMark.SPACE));
		s6.addWord(new Word("character", PunctuationMark.SPACE));
		s6.addWord(new Word("was", PunctuationMark.SPACE));
		s6.addWord(new Word("always", PunctuationMark.SPACE));
		s6.addWord(new Word("important", PunctuationMark.PERIOD));

		// Sentence 7
		Sentence s7 = new Sentence();
		s7.addWord(new Word("The", PunctuationMark.SPACE));
		s7.addWord(new Word("family", PunctuationMark.SPACE));
		s7.addWord(new Word("gathered", PunctuationMark.SPACE));
		s7.addWord(new Word("together", PunctuationMark.SPACE));
		s7.addWord(new Word("during", PunctuationMark.SPACE));
		s7.addWord(new Word("the", PunctuationMark.SPACE));
		s7.addWord(new Word("evening", PunctuationMark.PERIOD));

		text.addSentence(s1);
		text.addSentence(s2);
		text.addSentence(s3);
		text.addSentence(s4);
		text.addSentence(s5);
		text.addSentence(s6);
		text.addSentence(s7);

		return text;
	}

}
