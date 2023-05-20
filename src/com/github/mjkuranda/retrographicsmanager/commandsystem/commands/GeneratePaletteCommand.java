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

    private String paletteName;

    private PaletteTypes type;

    private boolean isBrighter;

    public GeneratePaletteCommand(String[] lineArgs) {
        this.type = "block".equals(lineArgs[2]) ? PaletteTypes.BLOCK : PaletteTypes.RECTANGLE;
        this.isBrighter = "light".equals(lineArgs[1]);
        this.paletteName = getPaletteName(lineArgs);
    }

    @Override
    public void execute() {
        if (!new File("dat/output").exists()) {
            try {
                Files.createDirectories(Paths.get("dat/output"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Palette palette = PaletteFactory.get(type, isBrighter);
        PaletteWriter.save(palette, paletteName, 1);
    }

    private String getPaletteName(String[] lineArgs) {
        String dateTime = LocalDateTime.now().toString().substring(0, 19).replaceAll(":", "-");

        return dateTime + "-palette-" + lineArgs[1] + "-" + lineArgs[2];
    }
}
