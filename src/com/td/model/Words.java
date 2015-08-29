package com.td.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class Words implements Iterator{

	public final String sortedBy;

	public final Word language;

	public final Path location;

	public final ArrayList<Word> massive;

	public int index = 0;

	public Words(final String sortedBy, final Word language, final Path location, final ArrayList<Word> massive) {
		this.sortedBy = sortedBy;
		this.language = language;
		this.location = location;
		this.massive = massive;
	}

	@Override
	public boolean hasNext() { ////////////////////////////////////////////////// Maybe error
		return massive.get(index) != null;
	}

	@Override
	public Object next() {
		return massive.get(index);
	}
}
