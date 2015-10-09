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

	public Loader(String path) throws FileNotFoundException {
		fileReader = new FileReader(path);

	}

	public Text loadText() throws IOException {
		String string = "";
		while (fileReader.ready()){
			final char[] chars = new char[50];
			fileReader.read(chars);
			string = string + String.copyValueOf(chars);
			}
//		Translator translate = Translator.getInstance();
//		String language = translate.detect(string.substring(0, 5));		WEIRD error, really
		final Text text = new Text(string, new Word(Language.ENGLISH), null);
		return text;
		}
	}


