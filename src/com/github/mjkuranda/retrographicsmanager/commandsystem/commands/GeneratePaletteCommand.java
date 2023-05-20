package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteWriter;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes.Palette;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes.PaletteFactory;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes.PaletteTypes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class GeneratePaletteCommand implements Command {

    private String[] lineArgs;

    public GeneratePaletteCommand(String[] lineArgs) {
        this.lineArgs = lineArgs;
    }

    @Override
    public void execute() {
        String dateTime = LocalDateTime.now().toString().substring(0, 19).replaceAll(":", "-");
        String paletteName = dateTime + "-palette-" + lineArgs[1] + "-" + lineArgs[2];

        if (lineArgs.length > 3) {
            paletteName = lineArgs[3];
        }

        if (!new File("dat/output").exists()) {
            try {
                Files.createDirectories(Paths.get("dat/output"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        PaletteTypes type = "block".equals(lineArgs[2]) ? PaletteTypes.BLOCK : PaletteTypes.RECTANGLE;
        boolean isBrighter = "light".equals(lineArgs[1]);
        Palette palette = PaletteFactory.get(type, isBrighter);
        PaletteWriter.save(palette, paletteName, 1);
    }
}
