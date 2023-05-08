package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import java.awt.image.BufferedImage;

public class PaletteGenerator {

    public static BufferedImage getRectanglePalette(Palette palette, int scale) {
        BufferedImage img = new BufferedImage(32 * scale, 8 * scale, BufferedImage.TYPE_INT_RGB);

        for (int c = 0; c < 256; c++) {
            int color = palette.getColor(c);

            for (int y = 0; y < scale; y++) {
                for (int x = 0; x < scale; x++) {
                    img.setRGB((c % 32) * scale + x, (c / 32) * scale + y, color);
                }
            }
        }

        return img;
    }

    public static BufferedImage getBlockPalette(Palette palette, int scale) {
        BufferedImage img = new BufferedImage(8 * scale, 32 * scale, BufferedImage.TYPE_INT_RGB);

        // Render blocks
        for (int b = 0; b < 4; b++) {
            // Render square
            for (int i = 0; i < 64; i++) {
                int x = i % 8;
                int y = i / 8;

                int color = palette.getColor((x * 4) + (y * 32) + b);

                // Scale
                for (int ys = 0; ys < scale; ys++) {
                    for (int xs = 0; xs < scale; xs++) {
                        img.setRGB((x * scale) + xs, (y * scale) + ys + (b * scale * 8), color);
                    }
                }
            }
        }

        return img;
    }

}
