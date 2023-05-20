package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.GeneratePaletteCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncompleteCommandException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncorrectCommandArgumentException;

public class GeneratePaletteCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        if (lineArgs.length < 3) {
            throw new IncompleteCommandException(lineArgs[0]);
        }

        if (!"light".equals(lineArgs[1]) && !"dark".equals(lineArgs[1])) {
            throw new IncorrectCommandArgumentException(lineArgs[1]);
        }

        if (!"block".equals(lineArgs[2]) && !"rectangle".equals(lineArgs[2])) {
            throw new IncorrectCommandArgumentException(lineArgs[2]);
        }

        return new GeneratePaletteCommand(lineArgs);
    }
}
