package com.github.mjkuranda.retrographicsmanager;

import com.github.mjkuranda.retrographicsmanager.commandsystem.CommandFactory;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;

import java.util.Scanner;

public class RetroGraphicsManager {
    public static final String VERSION = "3.1.0";
    public static final String RELEASE = "2023-05-17";

    private static RetroGraphicsManager app;
    private final ApplicationManager manager;

    public static RetroGraphicsManager getInstance() {
        if (app == null) {
            app = new RetroGraphicsManager();
        }

        return app;
    }

    private RetroGraphicsManager() {
        manager = new ApplicationManager();
    }

    private class ApplicationManager {
        private boolean isRunning;

        ApplicationManager() {
            this.isRunning = false;
        }

        void setRunning(boolean isRunning) {
            this.isRunning = isRunning;
        }

        boolean isRunning() {
            return isRunning;
        }
    }

    public void start() {
        manager.setRunning(true);
        run();
    }

    public void stop() {
        manager.setRunning(false);
    }

    private void run() {
        System.out.println("RetroGraphicsManager");
        System.out.println("Version: \t" + VERSION);
        System.out.println("Released:\t" + RELEASE);
        System.out.println("Author:\t\tmjkuranda");

        Scanner scan = new Scanner(System.in);
        String[] lineArgs;

        while (manager.isRunning()) {
            System.out.print("> ");
            lineArgs = scan.nextLine().split(" ");
            executeCommand(lineArgs);
        }

        System.out.println("Exit");
    }

    private void executeCommand(String lineArgs[]) {
        Command c = CommandFactory.get(lineArgs);

        if (!c.isValid()) {
            return;
        }

        c.execute();
    }
}
