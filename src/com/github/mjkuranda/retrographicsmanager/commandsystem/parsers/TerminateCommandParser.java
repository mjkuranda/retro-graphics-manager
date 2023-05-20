package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.TerminateCommand;

public class TerminateCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        return new TerminateCommand();
    }
}
