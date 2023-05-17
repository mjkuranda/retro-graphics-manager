package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import java.io.File;

/***
 * list | ls
 * @param type in or out argument to list all files
 */
public class ListCommand implements Command {

    // TODO: CommandValidator to prevalidate command
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

    @Override
    public boolean isValid() {
        if (lineArgs.length != 2) {
            System.out.println("Error: Incomplete command");

            return false;
        }

        if (!"in".equals(lineArgs[1]) && !"out".equals(lineArgs[1])) {
            System.out.println("Error: incorrect argument - " + lineArgs[1]);

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
