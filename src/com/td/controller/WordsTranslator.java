package com.td.controller;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import com.td.model.Word;
import com.td.model.Words;

import java.util.ArrayList;


public class WordsTranslator {

	public static Words translate(Words words) {

	for (Word word : words.ourWords.keySet()){

			ArrayList<Word> translateWord = new ArrayList<>();
			translateWord.add(translate(word));
			words.ourWords.put(word,translateWord);
		}

		return  words;
	}

	private static Word translate(Word word){
		Translator translator = Translator.getInstance();
		return new Word(translator.translate(word.spelling, Language.ENGLISH, Language.RUSSIAN));
	}

}
