package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import com.github.mjkuranda.retrographicsmanager.RetroGraphicsManager;

public class TerminateCommand implements Command {

    @Override
    public void execute() {
        RetroGraphicsManager app = RetroGraphicsManager.getInstance();
        app.stop();
    }
}
