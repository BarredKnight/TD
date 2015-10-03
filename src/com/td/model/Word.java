package com.td.model;

public class Word {

	public final String spelling;

	public Word(final String spelling) {
		this.spelling = spelling;
	}

	@Override
	public String toString(){
		return spelling;
	}

	@Override
	public int hashCode() {
		return spelling.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Word word = (Word) o;

		return spelling.equals(word.spelling);

	}


}
