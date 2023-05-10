package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import com.github.mjkuranda.retrographicsmanager.palettes.Palette;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PaletteWriter {

    public static void rectanglePalette(Palette palette, String fileName, int scale) {
        File file = new File("./dat/output/" + fileName + ".png");

        try {
            ImageIO.write(PaletteGenerator.getRectanglePalette(palette, scale), "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void blockPalette(Palette palette, String fileName, int scale) {
        File file = new File("./dat/output/" + fileName + ".png");

        try {
            ImageIO.write(PaletteGenerator.getBlockPalette(palette, scale), "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
