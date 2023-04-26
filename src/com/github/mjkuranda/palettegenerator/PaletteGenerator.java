package com.github.mjkuranda.palettegenerator;

import java.awt.image.BufferedImage;

public class PaletteGenerator {

    public static BufferedImage getDarkerPalette(int scale) {
        BufferedImage img = new BufferedImage(32 * scale, 8 * scale, BufferedImage.TYPE_INT_RGB);

        for (int c = 0; c < 256; c++) {
            int color = PaletteColor.getDarker(c);
            PaletteColor.print(color);

            for (int y = 0; y < scale; y++) {
                for (int x = 0; x < scale; x++) {
                    img.setRGB((c % 32) * scale + x, (c / 32) * scale + y, color);
                }
            }
        }

        return img;
    }

    public static BufferedImage getBrighterPalette(int scale) {
        return null;
    }
}
