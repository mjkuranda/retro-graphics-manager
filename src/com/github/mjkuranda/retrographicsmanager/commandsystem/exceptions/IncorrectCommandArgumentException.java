package com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions;

public class IncorrectCommandArgumentException extends RuntimeException {

    private String arg;

    public IncorrectCommandArgumentException(String arg) {
        super("Incorrect command argument: " + arg);

        this.arg = arg;
    }

    public String getArgument() {
        return arg;
    }
}
