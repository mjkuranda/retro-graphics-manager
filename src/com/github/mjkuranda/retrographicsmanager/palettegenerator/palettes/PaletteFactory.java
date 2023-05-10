package com.github.mjkuranda.retrographicsmanager.palettegenerator.palettes;

public class PaletteFactory {

    /***
     * Creates specific palette.
     * @param type PaletteType
     * @param isBrighter boolean
     * @return Palette
     */
    public static Palette get(PaletteTypes type, boolean isBrighter) {
        return switch(type) {
            case BLOCK -> new BlockPalette(isBrighter);
            case RECTANGLE -> new RectanglePalette(isBrighter);
        };
    }
}
