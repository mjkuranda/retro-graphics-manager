package com.github.mjkuranda.retrographicsmanager.converters;

import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteColor;

import java.awt.*;

public class ColorConverter {

    /***
     * Returns color converted to 8 bit.
     * @param color Any color.
     * @param isBrighter Flag defines if color should be brighter or not.
     * @return Converted color to 8 bit style.
     */
    public static int toRetroColor(int color, boolean isBrighter) {
        int idx = PaletteColor.getIdx(new Color(color));

        if (isBrighter) {
            return PaletteColor.getBrighter(idx);
        }

        return PaletteColor.getDarker(idx);
    }
}
