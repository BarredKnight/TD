package com.td.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Words implements Iterator{

	public final String sortedBy;

	public final Path location;

	public final LinkedHashMap <Word,ArrayList<Word>> ourWords;

	public int index = 0;



	public Words(final String sortedBy, final Path location, final LinkedHashMap <Word,ArrayList<Word>> ourWords) {
		this.sortedBy = sortedBy;
		this.location = location;
		this.ourWords = ourWords;
	}



	@Override
	public boolean hasNext() { ////////////////////////////////////////////////// Maybe error
		return ourWords.get(index) != null;
	}

	@Override
	public Object next() {
		return ourWords.get(index);
	}
}
