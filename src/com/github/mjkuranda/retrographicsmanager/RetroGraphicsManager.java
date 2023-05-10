package com.github.mjkuranda.retrographicsmanager;

import com.github.mjkuranda.retrographicsmanager.converters.ImageConverter;
import com.github.mjkuranda.retrographicsmanager.palettes.BlockPalette;
import com.github.mjkuranda.retrographicsmanager.palettes.Palette;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteWriter;
import com.github.mjkuranda.retrographicsmanager.palettes.RectanglePalette;

import java.awt.image.BufferedImage;

public class RetroGraphicsManager {

    public void start() {
        Palette rectanglePaletteDarker = new RectanglePalette();
        Palette rectanglePaletteBrighter = new RectanglePalette(true);
        Palette blockPaletteDarker = new BlockPalette();
        Palette blockPaletteBrighter = new BlockPalette(true);
        PaletteWriter.save(rectanglePaletteDarker, "rect-palette-darker", 4);
        PaletteWriter.save(rectanglePaletteBrighter, "rect-palette-brighter", 4);
        PaletteWriter.save(blockPaletteDarker, "block-palette-darker", 4);
        PaletteWriter.save(blockPaletteBrighter, "block-palette-brighter", 4);

        BufferedImage img = ImageConverter.toRetroImage("retro.png", true);
        ImageConverter.saveImage(img, "retro-converted.png");

        BufferedImage img2 = ImageConverter.toRetroImage("space.jpg", true);
        ImageConverter.saveImage(img2, "space-converted.png");
    }
}
