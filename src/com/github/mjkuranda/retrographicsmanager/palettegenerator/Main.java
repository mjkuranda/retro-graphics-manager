package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import com.github.mjkuranda.retrographicsmanager.converters.ImageConverter;

import java.awt.image.BufferedImage;

/***
 * @author mjkuranda
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, from my app!");

        Palette paletteDarker = new Palette();
        PaletteWriter.rectanglePalette(paletteDarker, "palette-darker", 4);
        PaletteWriter.blockPalette(paletteDarker, "palette-block", 4);

        BufferedImage img = ImageConverter.toRetroImage("retro.png", true);
        ImageConverter.saveImage(img, "retro-converted.png");

        BufferedImage img2 = ImageConverter.toRetroImage("space.jpg", true);
        ImageConverter.saveImage(img2, "space-converted.png");
    }
}
