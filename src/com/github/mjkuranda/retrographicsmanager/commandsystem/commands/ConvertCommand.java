package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import com.github.mjkuranda.retrographicsmanager.converters.ImageConverter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class ConvertCommand implements Command {

    private String[] lineArgs;

    public ConvertCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        if (!new File("dat/output/conversions").exists()) {
            try {
                Files.createDirectories(Paths.get("dat/output/conversions"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedImage img = ImageConverter.toRetroImage(lineArgs[2], "light".equals(lineArgs[1]));
        ImageConverter.saveImage(img, getImageName(lineArgs));
    }

    private String getImageName(String[] lineArgs) {
        if (lineArgs.length < 4) {
            return "converted-" + lineArgs[2];
        }

        return lineArgs[3];
    }
}
