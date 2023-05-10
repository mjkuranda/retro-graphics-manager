package com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes;

import java.awt.image.BufferedImage;

class BlockPalette extends Palette {

    protected BlockPalette() {
        super();
    }

    protected BlockPalette(boolean isBrighter) {
        super(isBrighter);
    }

    @Override
    public BufferedImage get(int scale) {
        BufferedImage img = new BufferedImage(8 * scale, 32 * scale, BufferedImage.TYPE_INT_RGB);

        // Render blocks
        for (int b = 0; b < 4; b++) {
            // Render square
            for (int i = 0; i < 64; i++) {
                int x = i % 8;
                int y = i / 8;

                int color = this.getColor((x * 4) + (y * 32) + b);

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
