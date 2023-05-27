package com.github.mjkuranda.retrographicsmanager.commandsystem.exceptions;

public class FileExistsException extends RuntimeException {

    public FileExistsException(String name) {
        super("File exists: " + name);
    }
}
