package com.td.view;

import com.td.model.Words;

public class ConsoleView {

    private static final int CELL_LENGTH = 15;

    public static void showWords(Words words){
        boolean ln = false;


        for (int i = 0; i < words.ourWords.size(); i++ )
            if (ln)
                System.out.println(words.ourWords.values().toString());
            else {
                System.out.println(words.ourWords.values());
                for (int j = 0; j < CELL_LENGTH - words.ourWords.values().size(); j++) ;
                System.out.print(" ");
            }

            ln = !ln;
        }
    }

