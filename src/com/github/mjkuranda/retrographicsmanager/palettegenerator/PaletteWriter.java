package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import com.github.mjkuranda.retrographicsmanager.palettes.Palette;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PaletteWriter {

    public static void save(Palette palette, String fileName, int scale) {
        File file = new File("./dat/output/" + fileName + ".png");

        try {
            ImageIO.write(palette.get(scale), "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
