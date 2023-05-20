package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

public enum DirTypes {
    IN("input"),
    OUT("output");

    private String type;

    DirTypes(String type) {
        this.type = type;
    }

    String getType() {
        return type;
    }
}
