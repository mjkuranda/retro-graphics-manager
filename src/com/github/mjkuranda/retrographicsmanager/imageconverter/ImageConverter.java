package com.github.mjkuranda.retrographicsmanager.imageconverter;

import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteColor;
import com.github.mjkuranda.retrographicsmanager.palettegenerator.PaletteGenerator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {
    public static void saveImage(BufferedImage img, String fileName) {
        File file = new File("dat/output/conversions/" + fileName);

        try {
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static BufferedImage toRetroImage(String fileName) {
        try {
            BufferedImage img = ImageIO.read(new File("dat/input/" + fileName));

            return convert(img);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static BufferedImage convert(BufferedImage img) {
        BufferedImage converted = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                int color = PaletteColor.convertToRetro(img.getRGB(x, y));

                converted.setRGB(x, y, color);
            }
        }

        return converted;
    }
}
