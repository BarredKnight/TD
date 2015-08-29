package com.td.controller;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import com.td.model.Text;
import com.td.model.Word;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Loader {

	final FileReader fileReader;
	final File file;

	public Loader(File file) throws FileNotFoundException {
		fileReader = new FileReader(file);
		this.file = file;
	}

	public Text loadText() throws IOException {
		String string = "";
		while (fileReader.ready()){
			final char[] chars = new char[50];
			fileReader.read(chars);
			string = string + chars;
			}
		Translator translate = Translator.getInstance();
		String language = translate.detect(string.substring(0, 15));
		final Text text = new Text(string, new Word(language), file.toPath());
		return text;
		}
	}


