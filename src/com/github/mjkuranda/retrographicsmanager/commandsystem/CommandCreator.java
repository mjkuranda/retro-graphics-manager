package com.github.mjkuranda.retrographicsmanager.commandsystem;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.IncompleteCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.IncorrectArgumentCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncompleteCommandException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncorrectCommandArgumentException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.parsers.CommandParser;

public class CommandCreator {

    public static Command parse(String line) {
        String[] lineArgs = line.split(" ");
        CommandParser parser = CommandParserFactory.get(lineArgs[0]);
        Command c;

        try {
            c = parser.process(lineArgs);
        } catch (IncorrectCommandArgumentException err) {
            c = new IncorrectArgumentCommand(err.getArgument());
        } catch (IncompleteCommandException err) {
            c = new IncompleteCommand(err.getMessage());
        }

        return c;
    }
}
