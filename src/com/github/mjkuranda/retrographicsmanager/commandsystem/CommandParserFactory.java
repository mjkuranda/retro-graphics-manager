package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.*;

public class CommandParserFactory {

    public static CommandParser get(String arg) {
        return switch(arg) {
            case "list", "ls" -> new ListCommandParser();
            case "generate", "gen" -> new GeneratePaletteCommandParser();
            case "convert", "conv" -> new ConvertCommandParser();
            case "exit", "end", "terminate", "term" -> new TerminateCommandParser();
            default -> new UnknownCommandParser();
        };
    }
}
