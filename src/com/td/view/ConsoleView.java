package com.td.view;

import com.td.model.Words;

import java.util.ArrayList;
import java.util.List;

public class ConsoleView {


    public static void showWords(Words words){

        for (String stringToPrint : getLinesToShow(words.ourWords.toString())){
            System.out.println(stringToPrint);
        }
     }

    /**
     * Works only for string, gotten by toString from Map
     * @return the {@code List} of string, gotten from input String
     * */
    private static List<String> getLinesToShow(final String lineToSeparate){

        int newLineFrom = 1;
        List<String> outputLines = new ArrayList<String>();

        for (int i = 0; i < lineToSeparate.length(); i++){
            if (lineToSeparate.substring(i, i+1).equals("]")){
                outputLines.add(lineToSeparate.substring(newLineFrom, i+1));
                newLineFrom = i+3;
            }
            else{

            }
        }

        return outputLines;
    }
    }

