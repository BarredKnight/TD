package com.td.model;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Words{

	public final String sortedBy;

	public final Path location;

	public final LinkedHashMap <Word,ArrayList<Word>> ourWords;


	public Words(final String sortedBy, final Path location, final LinkedHashMap <Word,ArrayList<Word>> ourWords) {
		this.sortedBy = sortedBy;
		this.location = location;
		this.ourWords = ourWords;
	}

	public Words(LinkedHashMap<Word, ArrayList<Word>> ourWords) {
		this.ourWords = ourWords;
		this.sortedBy = null;
		this.location = null;
	}
}
