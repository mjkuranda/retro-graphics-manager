package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.UnknownCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.CommandParser;

public class CommandCreator {

    public static Command parse(String line) {
        String[] lineArgs = line.split(" ");
        CommandParser parser = CommandParserFactory.get(lineArgs[0]);
        Command c = new UnknownCommand(lineArgs);

        try {
            c = parser.process(lineArgs);
        } catch (RuntimeException err) {
            System.out.println(err.getMessage());
        }

        return c;
    }
}
