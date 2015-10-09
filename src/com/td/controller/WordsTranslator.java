package com.td.controller;

import com.gtranslate.Language;
import com.gtranslate.Translator;
import com.td.model.Word;
import com.td.model.Words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class WordsTranslator {

	public static Words translate(Words words) {

		Iterator<Map.Entry<Word,ArrayList<Word>>> itr = words.ourWords.entrySet().iterator();

		while (itr.hasNext()){

			Map.Entry<Word,ArrayList<Word>> entry = itr.next();

			ArrayList<Word> trans = new ArrayList<>();
			trans.add(translate(entry.getKey()));


			words.ourWords.put(entry.getKey(),trans);

		}

		return  words;
	}

	private static Word translate(Word word){
		Translator translator = Translator.getInstance();
		return new Word(translator.translate(word.spelling, Language.ENGLISH, Language.RUSSIAN));
	}

}
