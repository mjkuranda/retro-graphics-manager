package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

/***
 * Correct forms:
 * list in|out
 * ls in|out
 */
public class ListCommand extends Command {

    public ListCommand(String[] lineArgs) {
        super(lineArgs);
    }

    @Override
    public void execute() {
        if ("in".equals(lineArgs[1])) {
            listFiles(new File("dat/input"));

            return;
        }

        listFiles(new File("dat/output"));
    }

    @Override
    public boolean isValid() {
        if (lineArgs.length != 2) {
            return false;
        }

        if (!"in".equals(lineArgs[1]) && !"out".equals(lineArgs[1])) {
            return false;
        }

        return true;
    }

    private void listFiles(File folder) {
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}