package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.ConvertCommand;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.FileExistsException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.FileNotFoundException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncompleteCommandException;
import com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions.IncorrectCommandArgumentException;

import java.io.File;

public class ConvertCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        if (lineArgs.length < 4) {
            throw new IncompleteCommandException(lineArgs[0]);
        }

        if (!"light".equals(lineArgs[1]) && !"dark".equals(lineArgs[1])) {
            throw new IncorrectCommandArgumentException(lineArgs[1]);
        }

        if (!existsImage(lineArgs[2])) {
            throw new FileNotFoundException(lineArgs[2]);
        }

        if(lineArgs[3].length() > 0 && existsImage(lineArgs[3])) {
            throw new FileExistsException(lineArgs[3]);
        }

        return new ConvertCommand(lineArgs);
    }

    private boolean existsImage(String name) {
        return new File("dat/input/" + name).exists();
    }
}
