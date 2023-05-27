package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public class FileErrorCommand implements Command {

    private String message;

    public FileErrorCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
