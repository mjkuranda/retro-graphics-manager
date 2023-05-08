package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import java.awt.*;

/***
 * @author mjkuranda
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, from my app!");

        Palette paletteDarker = new Palette();
        PaletteWriter.rectanglePalette(paletteDarker, "palette-darker", 4);
        PaletteWriter.blockPalette(paletteDarker, "palette-block", 4);
    }
}
