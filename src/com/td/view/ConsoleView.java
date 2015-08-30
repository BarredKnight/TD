package com.td.view;

import com.td.model.Word;
import com.td.model.Words;

public class ConsoleView {

    public static void showWords(Words words){
        boolean ln = false;
        for (Word word : words.massive){

            if (ln)
                System.out.println(word.spelling);
            else{
                System.out.print("      ");
                System.out.print(word.spelling);
            }
            ln = !ln;
        }
    }

}
