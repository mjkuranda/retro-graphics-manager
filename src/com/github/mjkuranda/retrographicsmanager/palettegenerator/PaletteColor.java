package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import java.awt.*;

public class PaletteColor {

    /***
     * Get index of palette color between 0 and 255.
     * @param color java.awt.Color
     * @return Number between 0 and 255.
     */
    public static int getIdx(Color color) {
        int col = color.getRGB();

        int r = (col & 0b111000000000000000000000) >> 16;
        int g = (col & 0b000000001110000000000000) >> 11;
        int b = (col & 0b000000000000000011000000) >> 6;

        return r | g | b;
    }

    /***
     * Returns darker palette color.
     * @param idx number between 0 and 255 - color id.
     * @return Palette darker color.
     */
    public static int getDarker(int idx) {
        int r = (idx & 0b11100000) >> 5;
        int g = (idx & 0b00011100) >> 2;
        int b = idx & 0b00000011;

        return (r << 21) | (g << 13) | (b << 6);
    }

    /***
     * Returns brighter palette color.
     * @param idx number between 0 and 255 - color id.
     * @return Palette brighter color.
     */
    public static int getBrighter(int idx) {
        return getDarker(idx) | 0b000111110001111100111111;
    }

    /***
     * Shows information about color value and RGB values.
     * @param color java.awt.Color
     */
    public static void print(Color color) {
        System.out.println("Color " + color.getRGB() + ": (" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")");
    }
}
