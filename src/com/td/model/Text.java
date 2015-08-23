package com.td.model;

import com.td.model.Word;

public class Text {

	public final String text;

	public final Word language;

	public Text(final String text, final Word language) {
		this.text = text;
		this.language = language;
	}
}
