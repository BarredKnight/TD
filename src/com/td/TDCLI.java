package com.td;

import com.td.controller.Crusher;
import com.td.controller.Loader;
import com.td.controller.WordsTranslator;
import com.td.controller.downloader.FileSystemDownloader;
import com.td.model.Text;
import com.td.model.Words;
import com.td.view.ConsoleView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class TDCLI {
    public static void main(String[] args) {
        System.out.println("Enter path to text-file :");
        Scanner filePathScanner = new Scanner(System.in);

        FileSystemDownloader downloader = new FileSystemDownloader();

        final String path = filePathScanner.nextLine();
        final File file = new File(path);
        try {
            downloader.download(file.toPath());
        } catch (Exception e) {
            System.out.println("Exception with downloading");
        }
        System.out.println("Downloading file : DONE ");

        Text clearText = null;
        try {
            Loader loader = new Loader(file);
            clearText = loader.loadText();
        } catch (FileNotFoundException e) {
            System.out.println("Loading : ERROR ");
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Loading file : ERROR");
        }
        System.out.println("Loading file : DONE");

        System.out.print("Crushing file : ");
        Words clearWords = null;
        try {
            clearWords = Crusher.crush(clearText);
        } catch (MalformedURLException e) {
            System.out.println("ERROR");
        }
        System.out.println("DONE");

        System.out.println("Translating words : ");
        Words translatedWords = null;
        translatedWords = WordsTranslator.translate(clearWords);
        System.out.println("DONE");

        System.out.println("READY TO SHOW !");
        System.out.println("sleeping for a while");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ConsoleView.showWords(translatedWords);


        System.out.println("\n\nLET'S CELEBRATE IT");


    }
}
