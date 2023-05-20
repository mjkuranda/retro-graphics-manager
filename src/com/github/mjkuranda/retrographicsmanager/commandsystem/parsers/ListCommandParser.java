package com.github.mjkuranda.retrographicsmanager.commandsystem.parsers;

import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.Command;
import com.github.mjkuranda.retrographicsmanager.commandsystem.commands.ListCommand;

public class ListCommandParser implements CommandParser {

    @Override
    public Command process(String[] lineArgs) {
        if (lineArgs.length != 2) {
            System.out.println("Error: Incomplete command");

            return null;
        }

        if (!"in".equals(lineArgs[1]) && !"out".equals(lineArgs[1])) {
            System.out.println("Error: incorrect argument - " + lineArgs[1]);

            return null;
        }

        return new ListCommand(lineArgs);
    }
}
