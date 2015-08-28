package com.td.model;

import java.nio.file.Path;

public class Words<O,M> {

	public final String sortedBy;

	public final Word language;

	public final Path location;

	public Words(final String sortedBy, final Word language, final Path location) {
		this.sortedBy = sortedBy;
		this.language = language;
		this.location = location;
	}
}
