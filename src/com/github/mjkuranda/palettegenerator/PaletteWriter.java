package com.github.mjkuranda.palettegenerator;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PaletteWriter {

    public static void rectanglePalette(Palette palette, String fileName) {
        File paletteDarker = new File("./dat/output/" + fileName + ".png");

        try {
            ImageIO.write(PaletteGenerator.getRectanglePalette(palette, 4), "png", paletteDarker);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
