package com.td.model;

import com.td.model.parameters.WordStatus;
import com.td.model.parameters.WordType;
import com.td.model.parameters.WordSense;
import com.td.model.parameters.WordPronunciation;

public class Word {

	public final WordType type;

	public final WordSense sense;

	public final String spelling;

	public final WordPronunciation pronunciation;

	public final Words links;

	public final WordStatus status;

	public Word(final WordType type, final WordSense sense, final String spelling, final WordPronunciation pronunciation, final Words links, final WordStatus status) {
		this.type = type;
		this.sense = sense;
		this.spelling = spelling;
		this.pronunciation = pronunciation;
		this.links = links;
		this.status = status;
	}
}
