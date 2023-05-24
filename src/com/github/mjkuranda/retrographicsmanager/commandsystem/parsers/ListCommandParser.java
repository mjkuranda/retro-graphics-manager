package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.DirTypes;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.ListCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncompleteCommandException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncorrectCommandArgumentException;

public class ListCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        if (lineArgs.length != 2) {
            throw new IncompleteCommandException(lineArgs[0]);
        }

        if (!"in".equals(lineArgs[1]) && !"out".equals(lineArgs[1])) {
            throw new IncorrectCommandArgumentException(lineArgs[1]);
        }

        return new ListCommand(lineArgs[1]);
    }
}
