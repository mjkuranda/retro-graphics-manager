package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public class IncorrectArgumentCommand implements Command {

    private String arg;

    public IncorrectArgumentCommand(String arg) {
        this.arg = arg;
    }

    @Override
    public void execute() {
        System.out.println("Incorrect command argument: " + arg);
    }
}
