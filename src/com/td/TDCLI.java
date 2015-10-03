package com.td;

import com.td.controller.Crusher;
import com.td.controller.Loader;
import com.td.controller.WordsTranslator;
import com.td.model.Text;
import com.td.model.Words;
import com.td.view.ConsoleView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class TDCLI {
    public static void main(String[] args) {

        ConsoleView.show(ConsoleView.translate(ConsoleView.crush(ConsoleView.load())));

    }
}
