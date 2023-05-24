package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

public class ListCommand implements Command {

    private DirTypes dirType;

    public ListCommand(String type) {
        this.dirType = DirTypes.IN.getType().equals(type) ? DirTypes.IN : DirTypes.OUT;
    }

    @Override
    public void execute() {
        listFiles(new File("dat/" + dirType.getType()));
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
