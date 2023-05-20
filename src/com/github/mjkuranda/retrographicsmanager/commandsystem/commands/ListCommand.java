package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

public class ListCommand implements Command {

    private final String[] lineArgs;

    private DirTypes dirType;

    public ListCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        listFiles(new File("dat/" + dirType.getType()));
    }

    public ListCommand setDirType(DirTypes type) {
        this.dirType = type;

        return this;
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
