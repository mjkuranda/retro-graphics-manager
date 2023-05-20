package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public class UnknownCommand implements Command {

    private String[] lineArgs;

    public UnknownCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        System.out.println("Unknown command: " + lineArgs[0]);
    }
}
