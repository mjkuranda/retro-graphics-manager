package com.github.mjkuranda.retrographicsmanager.converters;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {

    /***
     * Saves a converted image.
     * @param img Converted image
     * @param fileName File name with an extension
     */
    public static void saveImage(BufferedImage img, String fileName) {
        File file = new File("dat/output/conversions/" + fileName);

        try {
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * Returns converted image to retro 8 bit style image.
     * @param fileName File name of the file with an extension.
     * @param isBrighter Flag that defines if the image should be brighter or not.
     * @return Converted image to retro 8 bit style.
     */
    public static BufferedImage toRetroImage(String fileName, boolean isBrighter) {
        try {
            BufferedImage img = ImageIO.read(new File("dat/input/" + fileName));

            return convert(img, isBrighter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * Converts pixel by pixel...
     * @param img Default image.
     * @param isBrighter Flag that defines if image should be brighter or not.
     * @return Converted image to 8 bit style.
     */
    private static BufferedImage convert(BufferedImage img, boolean isBrighter) {
        BufferedImage converted = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                int color = ColorConverter.toRetroColor(img.getRGB(x, y), isBrighter);

                converted.setRGB(x, y, color);
            }
        }

        return converted;
    }
}
