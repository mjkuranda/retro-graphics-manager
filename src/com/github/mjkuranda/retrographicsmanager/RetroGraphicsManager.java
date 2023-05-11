package com.github.mjkuranda.retrographicsmanager;

import com.github.mjkuranda.retrographicsmanager.commandsystem.CommandFactory;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;

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
        String[] lineArgs;
        Command c;

        while (isRunning) {
            System.out.print("> ");

            lineArgs = scan.nextLine().split(" ");

            if (ifTerminate(lineArgs)) {
                stop();

                continue;
            }

            c = CommandFactory.get(lineArgs);

            if (c == null) {
                System.out.println("Unknown command: " + lineArgs[0]);

                continue;
            }

            if (!c.isValid()) {
                continue;
            }

            c.execute();
        }

        System.out.println("Exit");
    }

    private boolean ifTerminate(String[] lineArgs) {
        if (lineArgs.length == 0) {
            return false;
        }

        return switch(lineArgs[0]) {
            case "exit", "end", "term", "terminate" -> true;
            default -> false;
        };
    }
}
