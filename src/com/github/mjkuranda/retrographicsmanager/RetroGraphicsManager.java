package com.github.mjkuranda.retrographicsmanager;

import java.util.Scanner;

public class RetroGraphicsManager {
    public static final String VERSION = "3.0.0";
    public static final String RELEASE = "2023-05-11";

    private boolean isRunning;

    public RetroGraphicsManager() {
        isRunning = false;
    }

    public void start() {
        isRunning = true;
        run();
    }

    private void stop() {
        isRunning = false;
    }

    private void run() {
        System.out.println("RetroGraphicsManager");
        System.out.println("Version: \t" + VERSION);
        System.out.println("Released:\t" + RELEASE);
        System.out.println("Author:\t\tmjkuranda");

        Scanner scan = new Scanner(System.in);
        String line;

        while (isRunning) {
            System.out.print("\n> ");

            line = scan.nextLine();
            System.out.print(line);
        }
    }
}
