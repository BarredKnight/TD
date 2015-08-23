package com.td.model;

public class Words {

	public final String groupedBy;

	public final String sortedBy;

	public final Word language;

	public Words(final String groupedBy, final String sortedBy, final Word language) {
		this.groupedBy = groupedBy;
		this.sortedBy = sortedBy;
		this.language = language;
	}
}
