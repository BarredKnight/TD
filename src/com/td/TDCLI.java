package com.td;

import com.td.view.ConsoleView;

public class TDCLI {
    public static void main(String[] args) {

        ConsoleView.show(ConsoleView.translate(ConsoleView.crush(ConsoleView.load())));

    }
}
