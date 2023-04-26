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

        File palette = new File("./dat/output/palette.png");
        try {
            ImageIO.write(PaletteGenerator.getDarkerPalette(4), "png", palette);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
