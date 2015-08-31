package com.td.view;

import com.td.model.Word;
import com.td.model.Words;

public class ConsoleView {

    private static final int CELL_LENGTH = 15;

    public static void showWords(Words words){
        boolean ln = false;
        for (Word word : words.massive){

            if (ln)
                System.out.println(word.spelling);
            else{
                System.out.print(word.spelling);
                for (int i = 0; i < CELL_LENGTH - word.spelling.length(); i++){
                    System.out.print(" ");
                }
            }
            ln = !ln;
        }
    }

}
