package com.github.mjkuranda.retrographicsmanager.palettegenerator;

public class Palette {
    private int[] colors;
    private boolean isBrighter;

    public Palette() {
        this(false);
    }

    public Palette(boolean isBrighter) {
        this.colors = new int[256];
        this.isBrighter = isBrighter;

        init();
    }

    private void init() {
        for (int c = 0; c < 256; c++) {
            colors[c] = isBrighter ? PaletteColor.getBrighter(c) : PaletteColor.getDarker(c);
        }
    }

    public int[] getColors() {
        return colors;
    }

    public int getColor(int idx) {
        if (idx < 0 || idx > 255) {
            return -1;
        }

        return colors[idx];
    }

}
