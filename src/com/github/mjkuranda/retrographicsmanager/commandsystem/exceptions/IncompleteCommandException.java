package com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions;

public class IncompleteCommandException extends RuntimeException {

    public IncompleteCommandException(String commandName) {
        super("Incomplete command: " + commandName);
    }
}
