package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

public class ConvertCommand implements Command {

    private String[] lineArgs;

    public ConvertCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        File originalImage = new File(lineArgs[2]);
        File convertedImage = new File(lineArgs[3]);


    }
}
