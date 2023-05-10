package com.github.mjkuranda.retrographicsmanager;

import com.github.mjkuranda.retrographicsmanager.converters.ImageConverter;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes.*;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteWriter;

import java.awt.image.BufferedImage;

public class RetroGraphicsManager {

    public void start() {
        Palette rectanglePaletteDarker = PaletteFactory.get(PaletteTypes.RECTANGLE, true);
        Palette rectanglePaletteBrighter = PaletteFactory.get(PaletteTypes.RECTANGLE, false);
        Palette blockPaletteDarker = PaletteFactory.get(PaletteTypes.BLOCK, true);
        Palette blockPaletteBrighter = PaletteFactory.get(PaletteTypes.BLOCK, false);
        PaletteWriter.save(rectanglePaletteDarker, "rect-palette-darker", 4);
        PaletteWriter.save(rectanglePaletteBrighter, "rect-palette-brighter", 4);
        PaletteWriter.save(blockPaletteDarker, "block-palette-darker", 4);
        PaletteWriter.save(blockPaletteBrighter, "block-palette-brighter", 4);

        BufferedImage retroBrighter = ImageConverter.toRetroImage("retro.png", true);
        BufferedImage retroDarker = ImageConverter.toRetroImage("retro.png", false);
        ImageConverter.saveImage(retroBrighter, "retro-brighter.png");
        ImageConverter.saveImage(retroDarker, "retro-darker.png");

        BufferedImage spaceBrighter = ImageConverter.toRetroImage("space.jpg", true);
        BufferedImage spaceDarker = ImageConverter.toRetroImage("space.jpg", false);
        ImageConverter.saveImage(spaceBrighter, "space-brighter.png");
        ImageConverter.saveImage(spaceDarker, "space-darker.png");
    }
}
