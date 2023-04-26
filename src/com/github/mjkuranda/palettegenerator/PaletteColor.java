package com.github.mjkuranda.palettegenerator;

import java.awt.*;

public class PaletteColor {

    public static int getDarker(int idx) {
        int r = (idx & 0b11100000) >> 5;
        int g = (idx & 0b00011100) >> 2;
        int b = idx & 0b00000011;

        return (r << 21) | (g << 13) | (b << 6);
    }
    public static int getBrighter(int idx) {
        return getDarker(idx) | 0b000111110001111100111111;
    }

    public static void print(int color) {
        Color c = new Color(color);
        System.out.println("Color " + color + ": (" + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ")");
    }
}
