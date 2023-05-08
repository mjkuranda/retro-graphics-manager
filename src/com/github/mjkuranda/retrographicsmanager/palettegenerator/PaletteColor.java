package com.github.mjkuranda.retrographicsmanager.palettegenerator;

import java.awt.*;

public class PaletteColor {

    public static int getIdx(int color) {
        int r = (color & 0b111000000000000000000000) >> 16;
        int g = (color & 0b000000001110000000000000) >> 8;
        int b = (color & 0b000000000000000011000000) >> 6;

        return r | g | b;
    }

    public static int get(int idx) {
        return getDarker(idx);
    }

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
