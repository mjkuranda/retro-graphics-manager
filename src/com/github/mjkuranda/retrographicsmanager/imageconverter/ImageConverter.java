package com.github.mjkuranda.retrographicsmanager.imageconverter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {
    public static BufferedImage toRetroImage(String fileName) {
        try {
            BufferedImage img = ImageIO.read(new File("dat/input/" + fileName));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

//    private BufferedImage convert(BufferedImage img) {
//        for (int x = 0; x < img.getWidth(); x++) {
//            for (int y = 0; y < img.getHeight(); y++) {
//
//            }
//        }
//    }
}
