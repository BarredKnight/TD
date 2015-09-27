package com.td.controller;

import com.td.model.Word;
import com.td.model.Words;
import com.td.model.Text;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Crusher {

	private static final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static Text localText;

	public static Words crush(Text text) throws MalformedURLException {
		localText = text;
		LinkedHashMap<Word,ArrayList<Word>> words = new LinkedHashMap<>();
		Word nextWord;
		while ((nextWord = new Word(getNextWord(localText).spelling)).spelling != null){
			if (!words.containsValue(nextWord))
			words.put(nextWord,null);
			System.out.println(nextWord.spelling);
		}
		return new Words("without", null, words);
	}

	private static Word getNextWord(Text text){
		String word = "";
		int wordSize = 0;

		while (localText.text.length() > 0){
			final String temp = localText.text.substring(0,1);
			if (alphabet.contains(temp)){
				word = word + temp;
				wordSize = wordSize + 1;
				localText = new Text(localText.text.substring(1, localText.text.length()), localText.language, localText.location);
			}
			else {
				if (wordSize > 0) {
					return new Word(word);
				}
				else{
					localText = new Text(localText.text.substring(1, localText.text.length()), localText.language, localText.location);
				}

			}
		}

		return new Word(null);

	}

	private static boolean checkForContain(Words words, Word word){
		for (int i=0; i<words.ourWords.size(); i++) {
			if (words.ourWords.containsKey(word)) {
				return true;
			}
		}
		return false;
	}
}
