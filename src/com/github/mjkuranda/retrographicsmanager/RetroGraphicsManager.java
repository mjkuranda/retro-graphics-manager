package com.github.mjkuranda.retrographicsmanager;

import com.github.mjkuranda.retrographicsmanager.converters.ImageConverter;
import com.github.mjkuranda.retrographicsmanager.palettes.Palette;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteWriter;

import java.awt.image.BufferedImage;

public class RetroGraphicsManager {

    public void start() {
        Palette paletteDarker = new Palette();
        PaletteWriter.rectanglePalette(paletteDarker, "palette-darker", 4);
        PaletteWriter.blockPalette(paletteDarker, "palette-block", 4);

        BufferedImage img = ImageConverter.toRetroImage("retro.png", true);
        ImageConverter.saveImage(img, "retro-converted.png");

        BufferedImage img2 = ImageConverter.toRetroImage("space.jpg", true);
        ImageConverter.saveImage(img2, "space-converted.png");
    }
}
