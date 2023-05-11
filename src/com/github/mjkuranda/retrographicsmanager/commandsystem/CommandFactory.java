package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.*;

public class CommandFactory {

    public static Command get(String[] lineArgs) {
        Command c = switch (lineArgs[0]) {
            case "list", "ls" -> new ListCommand(lineArgs);
            default -> null;
        };

        if (c == null) {
            System.out.println("Unknown command: " + lineArgs[0]);

            return null;
        }

        return c;
    }
}
