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
		ArrayList<Word> words = new ArrayList<>();
		Word nextWord;
		while ((nextWord = new Word(getNextWord(localText).spelling)).spelling != null){
			if (!checkForContain(words, nextWord)) {
				words.add(nextWord);
				System.out.println(nextWord.spelling);
			}
		}

		final LinkedHashMap<Word, ArrayList<Word>> bufferMap = new LinkedHashMap<>();
		for (Word buffWord : words){
			bufferMap.put(buffWord, null);
		}
		return new Words(null, null, bufferMap);
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

	private static boolean checkForContain(ArrayList<Word> words, Word word){
		for (Word currentWord : words) {
			if (currentWord.spelling.equals(word.spelling)) {
				return true;
			}
		}
		return false;
	}
}
