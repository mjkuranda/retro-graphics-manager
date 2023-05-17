package com.github.mjkuranda.retrographicsmanager;

public class ApplicationManager {

    private static ApplicationManager instance;

    private boolean isRunning;

    private ApplicationManager() {
        this.isRunning = false;
    }

    public static ApplicationManager getInstance() {
        if (instance == null) {
            instance = new ApplicationManager();
        }

        return instance;
    }

    protected void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public boolean isRunning() {
        return isRunning;
    }
}
