package com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes;

import java.awt.image.BufferedImage;

class RectanglePalette extends Palette {

    protected RectanglePalette() {
        super();
    }

    protected RectanglePalette(boolean isBrighter) {
        super(isBrighter);
    }

    @Override
    public BufferedImage get(int scale) {
        BufferedImage img = new BufferedImage(32 * scale, 8 * scale, BufferedImage.TYPE_INT_RGB);

        for (int c = 0; c < 256; c++) {
            int color = this.getColor(c);

            for (int y = 0; y < scale; y++) {
                for (int x = 0; x < scale; x++) {
                    img.setRGB((c % 32) * scale + x, (c / 32) * scale + y, color);
                }
            }
        }

        return img;
    }
}
