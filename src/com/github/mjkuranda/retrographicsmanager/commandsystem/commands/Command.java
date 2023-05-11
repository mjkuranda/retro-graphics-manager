package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public abstract class Command {

    protected String[] lineArgs;

    public Command(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    public abstract void execute();

    public abstract boolean isValid();
}
