package com.td.controller;

import com.td.model.Word;
import com.td.model.Words;
import com.td.model.Text;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Crusher {

	private final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private Text localText;

	public Words crush(Text text) throws MalformedURLException {
		localText = text;
		ArrayList<Word> words = new ArrayList<>();
		Word nextWord;
		while ((nextWord = new Word(getNextWord(localText).spelling)).spelling != null){
			if (!words.contains(nextWord))
			words.add(nextWord);
		}
		return new Words("without", null, words);
	}

	private Word getNextWord(Text text){
		String word = "";
		int wordSize = 0;

		while (localText.text.length() > 0){
			final String temp = localText.text.substring(0,1);
			if (alphabet.contains(temp)){
				word = word + temp;
				wordSize = wordSize + 1;
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

}
