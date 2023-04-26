package com.github.mjkuranda.palettegenerator;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/***
 * @author mjkuranda
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World, from my app!");

        Palette paletteDarker = new Palette();
        PaletteWriter.rectanglePalette(paletteDarker, "palette-darker");
    }
}
