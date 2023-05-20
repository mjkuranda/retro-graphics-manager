package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.CommandParser;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.UnknownCommandParser;

public class CommandParserFactory {

    public static CommandParser get(String arg) {
        return switch(arg) {
//            case "list", "ls" -> new
            default -> new UnknownCommandParser();
        };
    }
}
