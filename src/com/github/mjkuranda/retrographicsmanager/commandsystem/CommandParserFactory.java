package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.CommandParser;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.ListCommandParser;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.TerminateCommandParser;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.UnknownCommandParser;

public class CommandParserFactory {

    public static CommandParser get(String arg) {
        return switch(arg) {
            case "list", "ls" -> new ListCommandParser();
            case "exit", "end", "terminate", "term" -> new TerminateCommandParser();
            default -> new UnknownCommandParser();
        };
    }
}
