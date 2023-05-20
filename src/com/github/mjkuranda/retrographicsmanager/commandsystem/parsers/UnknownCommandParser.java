package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.UnknownCommand;

public class UnknownCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        return new UnknownCommand(lineArgs);
    }
}
