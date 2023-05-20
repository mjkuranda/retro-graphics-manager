package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

public class ListCommand implements Command {

    private String[] lineArgs;

    public ListCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        if ("in".equals(lineArgs[1])) {
            listFiles(new File("dat/input"));

            return;
        }

        listFiles(new File("dat/output"));
    }

    private void listFiles(File folder) {
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles == null) {
            System.out.println("Empty directory");

            return;
        }

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
