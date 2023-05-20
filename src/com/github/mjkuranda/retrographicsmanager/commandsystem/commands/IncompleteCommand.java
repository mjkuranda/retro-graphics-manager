package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public class IncompleteCommand implements Command {

    private String message;

    public IncompleteCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
