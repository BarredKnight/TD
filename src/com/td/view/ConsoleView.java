package com.td.view;

import com.td.controller.Crusher;
import com.td.controller.Loader;
import com.td.controller.WordsTranslator;
import com.td.model.Text;
import com.td.model.Words;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    private final static String BORDER = "---";

    public static Text load() {
        System.out.println(BORDER + "loading" + BORDER);
        return loadText();
    }

    public static Words crush(final Text clearText) {
        System.out.println(BORDER + "crushing" + BORDER);
        try {
            return Crusher.crush(clearText);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Words translate(Words clearWords) {
        System.out.println(BORDER + "translating" + BORDER);
        return WordsTranslator.translate(clearWords);
    }

    public static void sort() {
    }

    public static void holdOn(int ms) {
        System.out.println(BORDER + "don't hurry" + BORDER);
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void show(Words words) {

        System.out.println(BORDER + "showing" + BORDER);
        holdOn(2000);
        for (String stringToPrint : getLinesToShow(words.ourWords.toString())) {
            System.out.println(stringToPrint);
        }
    }

    /**
     * Works only for string, gotten by toString from Map
     *
     * @return the {@code List} of string, gotten from input String
     */
    private static List<String> getLinesToShow(final String lineToSeparate) {

        int newLineFrom = 1;
        List<String> outputLines = new ArrayList<>();

        for (int i = 0; i < lineToSeparate.length(); i++) {
            if (lineToSeparate.substring(i, i + 1).equals("]")) {
                outputLines.add(lineToSeparate.substring(newLineFrom, i + 1));
                newLineFrom = i + 3;
            }
        }

        return outputLines;
    }

    private static Text loadText() {
        final Scanner pathScanner = new Scanner(System.in);

        System.out.println("Enter path to text-file :");
        while (true) {
            try {
                Loader loader = new Loader(pathScanner.nextLine());
                return loader.loadText();
            } catch (FileNotFoundException e) {
                System.out.println("Wrong way! Try again:");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
