package com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions;

public class FileNotFoundException extends RuntimeException {

    public FileNotFoundException(String name) {
        super("File not found: " + name);
    }
}
