package com.github.mjkuranda.palettegenerator;

import java.awt.*;

public class PaletteColor {

    public static int get(int idx) {
        return PaletteColor.get(idx, true);
    }

    public static int get(int idx, boolean isDarker) {
        int color = isDarker ? 0 : 255;

        int r = (idx & 0b11100000) >> 5;
        int g = (idx & 0b00011100) >> 2;
        int b = idx & 0b00000011;

        // TODO: Handle if brighter
        color = (r << 21) | (g << 13) | (b << 6);

        return color;
    }

    public static void print(int color) {
        Color c = new Color(color);
        System.out.println("Color " + color + ": (" + c.getRed() + ", " + c.getGreen() + ", " + c.getBlue() + ")");
    }
}
