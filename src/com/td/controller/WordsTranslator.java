package com.td.controller;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import com.td.model.Word;
import com.td.model.Words;

public class WordsTranslator {

	public static Words translate(Words words) {
		for (int i = 0; i < words.massive.size(); i++){
			words.massive.add(i+1, translate(words.massive.get(i)));
			i = i+1;
		}
		return  words;
	}

	private static Word translate(Word word){
		Translator translator = Translator.getInstance();
		return new Word(translator.translate(word.spelling, Language.ENGLISH, Language.RUSSIAN));
	}

}
