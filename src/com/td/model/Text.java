package com.td.model;

import java.nio.file.Path;

public class Text {

	public final String text;

	public final Word language;

	public final Path location;

	public Text(final String text, final Word language, final Path location) {
		this.text = text;
		this.language = language;
		this.location = location;
	}
}
