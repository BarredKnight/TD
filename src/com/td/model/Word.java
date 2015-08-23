package com.td.model;

import com.td.model.Words;
import com.td.model.parameters.WordType;
import com.td.model.parameters.WordSense;
import com.td.model.parameters.WordPronunciation;

public class Word {

	public final WordType type;

	public final WordSense sense;

	public final String spelling;

	public final WordPronunciation pronunciation;

	public final Words links;

	public Word(final WordType type, final WordSense sense, final String spelling, final WordPronunciation pronunciation, final Words links) {
		this.type = type;
		this.sense = sense;
		this.spelling = spelling;
		this.pronunciation = pronunciation;
		this.links = links;
	}
}
