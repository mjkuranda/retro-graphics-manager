package com.github.mjkuranda.retrographicsmanager.commandsystem.commands;

import com.github.mjkuranda.retrographicsmanager.Utils;
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

    private final String paletteName;

    private final PaletteTypes type;

    private final boolean isBrighter;

    private final int scale;

    public GeneratePaletteCommand(String[] lineArgs) {
        this.type = "block".equals(lineArgs[2]) ? PaletteTypes.BLOCK : PaletteTypes.RECTANGLE;
        this.isBrighter = "light".equals(lineArgs[1]);
        this.scale = lineArgs.length > 3 && Utils.isInteger(lineArgs[3]) ? Integer.parseInt(lineArgs[3]) : 1;
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
        PaletteWriter.save(palette, paletteName, scale);
    }

    private String getPaletteName(String[] lineArgs) {
        String name = fetchPaletteName(lineArgs);

        if (name == null) {
            String dateTime = LocalDateTime.now().toString().substring(0, 19).replaceAll(":", "-");

            return dateTime + "-palette-" + lineArgs[1] + "-" + lineArgs[2] + "-" + this.scale;
        }

        return name;
    }

    private String fetchPaletteName(String[] lineArgs) {
        if (lineArgs.length < 4) {
            return null;
        }

        if (!Utils.isInteger(lineArgs[3])) { // isn't scale parameter
            return lineArgs[3];
        }

        if (lineArgs.length < 5) {
            return null;
        }

        if (!Utils.isInteger(lineArgs[4])) { // isn't scale parameter
            return lineArgs[4];
        }

        return null;
    }
}
