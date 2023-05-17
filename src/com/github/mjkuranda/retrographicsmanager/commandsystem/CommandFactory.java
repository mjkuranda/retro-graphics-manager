package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.*;

public class CommandFactory {

    public static Command get(String[] lineArgs) {
        return switch (lineArgs[0]) {
            case "list", "ls" -> new ListCommand(lineArgs);
            case "exit", "end", "terminate", "term" -> new TerminateCommand();
            default -> new UnknownCommand(lineArgs);
        };
    }
}
